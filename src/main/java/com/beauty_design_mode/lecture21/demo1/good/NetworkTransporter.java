package com.beauty_design_mode.lecture21.demo1.good;

/**
 * 作为一个底层网络通信类，我们希望它的功能尽可能通用，而不只是服务于下载 HTML。
 * 所以，我们不应该直接依赖太具体的发送对象 HtmlRequest。
 *
 * @author Alan Yin
 * @date 2021/8/17
 */

public class NetworkTransporter {

    // 省略属性和其他方法

    public Byte[] send(String address, byte[] data) {
        return null;
    }
}
