package com.beauty_design_mode.lecture34_35.v2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * 第一轮重构：提高代码的可读性
 *
 * @author Alan Yin
 * @date 2020/10/15
 */

public class RandomIdGenerator implements IdGenerator {

    @Override
    public String generator() {
        String substrOfHostName = getLastFieldOfHostName();
        long currentTimeMills = System.currentTimeMillis();
        String randomString = generateRandomAlphameric(8);
        String id = String.format("%s-%d-%s", substrOfHostName, currentTimeMills, randomString);
        return id;
    }

    private String generateRandomAlphameric(int length) {
        char[] randomChars = new char[length];
        int count = 0;
        Random random = new Random();
        while (count < length) {
            int maxAscii = 'z';
            int randomAscii = random.nextInt(maxAscii);
            boolean isDigit = randomAscii >= '0' && randomAscii <= '9';
            boolean isUppercase = randomAscii >= 'A' && randomAscii <= 'Z';
            boolean isLowercase = randomAscii >= 'a' && randomAscii <= 'z';
            if (isDigit || isUppercase || isLowercase) {
                randomChars[count] = (char) (randomAscii);
                ++count;
            }
        }
        return new String(randomChars);
    }


    public String getLastFieldOfHostName() {
        String substrOfHostName = null;
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            String[] tokens = hostName.split("\\.");
            substrOfHostName = tokens[tokens.length - 1];
            return substrOfHostName;
        } catch (UnknownHostException e) {
            System.out.println("Failed to get the host name." + e);
        }
        return substrOfHostName;
    }

    /**
     * 我们要解决最明显、最急需改进的代码可读性问题。具体有下面几点：
     *
     * - hostName 变量不应该被重复使用，尤其当这两次使用时的含义还不同的时候；
     * - 将获取 hostName 的代码抽离出来，定义为 getLastfieldOfHostName() 函数；
     * - 删除代码中的魔法数，比如，57、90、97、122；
     * - 将随机数生成的代码抽离出来，定义为 generateRandomAlphameric() 函数；
     * - generate() 函数中的三个 if 逻辑重复了，且实现过于复杂，我们要对其进行简化；
     * - 对 IdGenerator 类重命名，并且抽象出对应的接口。
     */

}

//    // 代码使用举例
// LogTraceIdGenerator logTraceIdGenerator = new RandomIdGenerator();