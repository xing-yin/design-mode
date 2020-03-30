package com.beauty_design_mode.lecture64.demo1;

/**
 * @author alan yin
 * @date 2020/3/30
 */

public enum State {

    /**
     * 超级玛丽的几个状态
     */
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    State(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
