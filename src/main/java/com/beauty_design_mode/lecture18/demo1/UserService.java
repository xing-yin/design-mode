package com.beauty_design_mode.lecture18.demo1;

import com.beauty_design_mode.lecture15.UserInfo;

/**
 * 方式1：把“接口”理解为一组 API 接口集合
 *
 * @author Alan Yin
 * @date 2021/8/11
 */

public interface UserService {

    boolean register(String cellphone, String password);

    boolean login(String cellphone, String password);

    UserInfo getUserInfoById(long id);

    UserInfo getUserInfoByCellphone(String cellphone);

}
