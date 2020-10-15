package com.beauty_design_mode.lecture34_35.v3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * @author Alan Yin
 * @date 2020/10/15
 */

public class RandomIdGenerator implements IdGenerator {

    @Override
    public String generator() {
        String substrOfHostName = getLastFieldOfHostName();
        long currentTimeMillis = System.currentTimeMillis();
        String randomString = generateRandomAlphameric(8);
        String id = String.format("%s-%d-%s",
                substrOfHostName, currentTimeMillis, randomString);
        return id;
    }

    /**
     * 改动1: 从 getLastFieldOfHostName() 函数中，将逻辑比较复杂的那部分代码剥离出来，定义为 getLastSubstrSplittedByDot() 函数。
     * 因为 getLastfieldOfHostName() 函数依赖本地主机名，所以，剥离出主要代码之后这个函数变得非常简单，可以不用测试。
     * 我们重点测试 getLastSubstrSplittedByDot() 函数即可。
     */
    protected String getLastFieldOfHostName() {
        String substrOfHostName = null;
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            substrOfHostName = getLastSubstrSplittedByDot(hostName);
            return substrOfHostName;
        } catch (UnknownHostException e) {
            System.out.println("Failed to get the host name." + e);
        }
        return substrOfHostName;
    }

    // 足够简单，可以不用测试
    private String getLastSubstrSplittedByDot(String hostName) {
        String[] tokens = hostName.split("\\.");
        String substrOfHostName = tokens[tokens.length - 1];
        return substrOfHostName;
    }


    /**
     * 改动2: 将 generateRandomAlphameric() 和 getLastSubstrSplittedByDot() 这两个函数的访问权限设置为 protected。
     * 这样做的目的是，可以直接在单元测试中通过对象来调用两个函数进行测试。
     */
    protected String generateRandomAlphameric(int length) {
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

    /**
     *【不是所有的对象都需要依赖注入】
     *
     * 依赖注入之所以能提高代码可测试性，主要是因为，通过这样的方式我们能轻松地用 mock 对象替换依赖的真实对象。
     * 那我们为什么要 mock 这个对象呢？
     * 这是因为，这个对象参与逻辑执行（比如，我们要依赖它输出的数据做后续的计算）但又不可控。
     <p></p>
     对于 Logger 对象来说，只往里写入数据，不参与业务逻辑的执行，不影响代码逻辑的正确性，
     所以，我们没有必要 mock Logger 对象。
     <p></p>
     除此之外，一些只是为了存储数据的值对象，比如 String、Map、UseVo，也没必要通过依赖注入的方式来创建，直接在类中通过 new 创建就可以了。
     */
}
