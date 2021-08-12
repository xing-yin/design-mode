package com.beauty_design_mode.lecture18.demo3.bad;

import java.util.Map;

/**
 * @author Alan Yin
 * @date 2021/8/12
 */

public class KafkaConfig implements Config {

    @Override
    public void update() {

    }

    /**
     * 以下 2 个 方法 KafkaConfig 不需要也不得不实现
     */
    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
}
