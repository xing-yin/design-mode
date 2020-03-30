package com.beauty_design_mode.lecture64.demo1.impl2;

/**
 * @author Alan Yin
 * @date 2020/3/30
 */

public enum Event {

    /**
     * 状态机事件
     */
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MEET_MONSTER(3);

    Event(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }
}
