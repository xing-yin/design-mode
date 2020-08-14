package com.beauty_design_mode.lecture62.v2.demo3;

/**
 * @author Alan Yin
 * @date 2020/8/11
 */

public class HandleA implements IHandle {

    @Override
    public boolean handle() {
        // 代码实现
        System.out.println("HandleA handle");
        return true;
    }
}
