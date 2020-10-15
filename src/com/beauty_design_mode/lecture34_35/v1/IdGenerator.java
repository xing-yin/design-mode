package com.beauty_design_mode.lecture34_35.v1;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * @author Alan Yin
 * @date 2020/10/15
 */

public class IdGenerator {

    public static String generator() {
        String id = "";
        try {
            String hostname = InetAddress.getLocalHost().getHostName();
            String[] token = hostname.split("\\.");
            if (token.length > 0) {
                hostname = token[token.length - 1];
            }
            char[] randomChars = new char[8];
            int count = 0;
            Random random = new Random();
            while (count < 8) {
                int randomAscii = random.nextInt(122);
                if (randomAscii >= 48 && randomAscii <= 57) {
                    randomChars[count] = (char) ('0' + (randomAscii - 48));
                    count++;
                } else if (randomAscii >= 65 && randomAscii <= 90) {
                    randomChars[count] = (char) ('A' + (randomAscii - 48));
                    count++;
                } else if (randomAscii >= 97 && randomAscii <= 122) {
                    randomChars[count] = (char) ('a' + (randomAscii - 48));
                    count++;
                }
            }
            id = String.format("%s-%d-%s",
                    hostname,
                    System.currentTimeMillis(),
                    new String(randomChars));
        } catch (UnknownHostException e) {
            System.out.println("Failed to get the host name." + e);
        }
        return id;
    }

    /**
     * 1.hostname 发生异常没有兜底方案
     * 2.不建议使用Random，不够随机
     * 3.while 循环这部分生成性能低
     *
     * 建议分成不同的方法实现，最后一个方法做整合（一些异常可能需要处理）
     */

}


