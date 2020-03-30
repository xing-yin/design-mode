package com.beauty_design_mode.lecture64.demo1.impl3;

import com.beauty_design_mode.lecture64.demo1.State;

/**
 * 超级玛丽接口(实现省略 cape 和 monster)
 *
 * @author Alan Yin
 * @date 2020/3/30
 */

public interface IMario {

    void obtainMushRoom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();

    State getName();
}
