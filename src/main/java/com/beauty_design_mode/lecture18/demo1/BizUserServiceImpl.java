package com.beauty_design_mode.lecture18.demo1;

import com.beauty_design_mode.lecture15.UserInfo;

/**
 * @author Alan Yin
 * @date 2021/8/11
 */

public class BizUserServiceImpl implements UserService, RestrictedUserService {

    @Override
    public boolean deleteUserByCellphone(String cellphone) {
        return false;
    }

    @Override
    public boolean deleteUserById(long id) {
        return false;
    }

    @Override
    public boolean register(String cellphone, String password) {
        return false;
    }

    @Override
    public boolean login(String cellphone, String password) {
        return false;
    }

    @Override
    public UserInfo getUserInfoById(long id) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByCellphone(String cellphone) {
        return null;
    }


    /**
     * 最好的解决方案是从架构设计的层面，通过接口鉴权的方式来限制接口的调用。
     * 不过，如果暂时没有鉴权框架来支持，我们还可以从代码设计的层面，尽量避免接口被误用。
     *
     * 我们参照接口隔离原则，调用者不应该强迫依赖它不需要的接口，将删除接口单独放到另外一个接口 RestrictedUserService 中，
     * 然后将 RestrictedUserService 只打包提供给后台管理系统来使用。
     */
}
