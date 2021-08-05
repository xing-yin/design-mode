package com.beauty_design_mode.lecture48.demo1;

import com.beauty_design_mode.lecture48.bad.UserVo;

/**
 * @author Alan Yin
 * @date 2021/3/3
 */

public interface IUserService {

    UserVo login(String username, String password);

    UserVo register(String username, String password);
}
