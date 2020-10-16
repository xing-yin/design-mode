package com.beauty_design_mode.lecture36;

import com.beauty_design_mode.lecture25_26.support.StringUtils;

/**
 * 函数出错返回方式4-抛出异常
 *
 * @author Alan Yin
 * @date 2020/10/16
 */

public class ExceptionDemo {

    private static String DEFAULT_HOST = "192.168.201.66";

    private static int DEFAULT_PORT = 6379;

    private String host;

    private int port;

    // address格式："192.121.2.33:7896"
    public void parseRedisAddress(String address) {
        this.host = DEFAULT_HOST;
        this.port = DEFAULT_PORT;

        if (StringUtils.isBlank(address)) {
            return;
        }

        String[] ipAndPort = address.split(":");
        if (ipAndPort == null || ipAndPort.length != 2) {
            // 运行时异常/非受检查的异常
            throw new RuntimeException("....");
        }

        this.host = ipAndPort[0];
        // parseInt()解析失败会抛出NumberFormatException运行时异常
        this.port = Integer.parseInt(ipAndPort[1]);
    }
}
