package com.beauty_design_mode.lecture37.v5;

import com.beauty_design_mode.lecture37.v5.exception.IdGenerationFailureException;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * 第五轮重构：重构ID生成器项目中各函数的异常处理代码
 * <p>
 *
 * @author Alan Yin
 * @date 2020/10/16
 */

public class RandomIdGenerator implements IdGenerator {


    @Override
    public String generator() {
        String substrOfHostName = null;
        /// todo 关键异常处理：倾向于明确将异常告知调用者
        try {
            substrOfHostName = getLastFieldOfHostName();
        } catch (UnknownHostException e) {
            /// todo 关键异常处理：捕获 UnknownHostException 异常，并重新包裹成新的异常 IdGenerationFailureException 往上抛出
            /**
             * 理由：
             a.调用者在使用 generate() 函数的时候，只需要知道它生成的是随机唯一 ID，并不关心 ID 是如何生成的。也就说是，这是依赖抽象而非实现编程。
             b.如果 generate() 函数直接抛出 UnknownHostException 异常，实际上是暴露了实现细节。
             从代码封装的角度来讲，我们不希望将 UnknownHostException 这个比较底层的异常，暴露给更上层的代码，也就是调用 generate() 函数的代码。
             而且，调用者拿到这个异常的时候，并不能理解这个异常到底代表了什么，也不知道该如何处理。
             c.UnknownHostException 异常跟 generate() 函数，在业务概念上没有相关性。
             */
            throw new IdGenerationFailureException("hostName is empty.");
        }
        long currentTimeMillis = System.currentTimeMillis();
        String randomString = generateRandomAlphameric(8);
        String id = String.format("%s-%d-%s",
                substrOfHostName, currentTimeMillis, randomString);
        return id;
    }

    /**
     * 重构：
     * <p>
     * a.返回 NULL 值还是异常对象，要看获取不到数据是正常行为，还是异常行为。
     * 获取主机名失败会影响后续逻辑的处理，并不是我们期望的，所以是一种异常行为,最好是抛出异常。
     * <p>
     * b.getLastFiledOfHostName() 函数用来获取主机名的最后一个字段，UnknownHostException 异常表示主机名获取失败，
     * 两者算是业务相关，所以可以直接将 UnknownHostException 抛出，不需要重新包裹成新的异常。
     */
    protected String getLastFieldOfHostName() throws UnknownHostException {
        String substrOfHostName;
        String hostName = InetAddress.getLocalHost().getHostName();
        /// todo 关键处理：此处做判断
        if (hostName == null || hostName.isEmpty()) {
            throw new UnknownHostException("hostName is empty.");
        }
        substrOfHostName = getLastSubstrSplittedByDot(hostName);
        return substrOfHostName;
    }


    protected String getLastSubstrSplittedByDot(String hostName) {
        if (hostName == null || hostName.isEmpty()) {
            /// todo 关键异常处理：参数校验抛出运行时异常
            throw new IllegalArgumentException("hostName is empty.");
        }
        String[] tokens = hostName.split("\\.");
        String substrOfHostName = tokens[tokens.length - 1];
        return substrOfHostName;
    }


    protected String generateRandomAlphameric(int length) {
        /// todo 关键异常处理：参数校验抛出运行时异常
        if (length <= 0) {
            throw new IllegalArgumentException("length must be positive number");
        }
        char[] randomChars = new char[length];
        int count = 0;
        Random random = new Random();
        while (count < length) {
            int maxAscii = 'z';
            int randomAscii = random.nextInt(maxAscii);
            boolean isDigit = randomAscii >= '0' && randomAscii <= '9';
            boolean isUppercase = randomAscii >= 'A' && randomAscii <= 'Z';
            boolean isLowwercase = randomAscii >= 'a' && randomAscii <= 'z';
            if (isDigit || isUppercase || isLowwercase) {
                randomChars[count] = (char) randomAscii;
                count++;
            }
        }
        return new String(randomChars);
    }

}
