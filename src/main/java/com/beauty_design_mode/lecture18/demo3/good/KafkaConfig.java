package com.beauty_design_mode.lecture18.demo3.good;

import com.beauty_design_mode.lecture18.demo3.common.ConfigSource;

/**
 * @author Alan Yin
 * @date 2021/8/12
 */

public class KafkaConfig implements Updater {

    private ConfigSource configSource;
    // 类似 RedisConfig，略


    public KafkaConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    @Override
    public void update() {

    }
}
