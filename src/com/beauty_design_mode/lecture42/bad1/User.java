package com.beauty_design_mode.lecture42.bad1;

import com.beauty_design_mode.lecture41.demo1.IdGenerator;

/**
 * @author Alan Yin
 * @date 2021/1/17
 */

public class User {

    public void create() {
        // 省略其他代码
        long id = IdGenerator.getInstance().getId();
        // 省略其他代码
    }
}
