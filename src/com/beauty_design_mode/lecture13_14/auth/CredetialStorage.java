package com.beauty_design_mode.lecture13_14.auth;

/**
 * 功能点：从存储中取出 AppID 和对应的密码
 * <p>
 * 基于接口而非具体的实现编程
 *
 * @author Alan Yin
 * @date 2020/10/12
 */

public interface CredetialStorage {

    String getPasswordByAppId(String appId);
}
