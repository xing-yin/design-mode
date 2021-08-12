package com.beauty_design_mode.lecture18.demo3.bad;

import java.util.Map;

/**
 * @author Alan Yin
 * @date 2021/8/12
 */

public class MysqlConfig implements Config {

    /**
     * 以下 update() 方法 MysqlConfig 不需要也不得不实现
     */
    @Override
    public void update() {
    }

    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
}
