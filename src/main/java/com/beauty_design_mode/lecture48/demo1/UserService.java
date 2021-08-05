package com.beauty_design_mode.lecture48.demo1;

import com.beauty_design_mode.lecture48.bad.UserVo;

/**
 * 业务代码：只关注业务逻辑
 *
 * @author Alan Yin
 * @date 2021/3/3
 */

public class UserService implements IUserService {

    @Override
    public UserVo login(String username, String password) {
        // 省略 login 逻辑
        // 返回 UserVo 数据
        return null;
    }

    @Override
    public UserVo register(String username, String password) {
        // 省略 login 逻辑
        // 返回 UserVo 数据
        return null;
    }

}
