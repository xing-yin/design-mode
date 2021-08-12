package com.beauty_design_mode.lecture18.demo3.good;

import com.beauty_design_mode.lecture18.demo3.common.ConfigSource;

import java.util.Map;

/**
 * @author Alan Yin
 * @date 2021/8/12
 */

public class MysqlConfig implements Viewer{

    // 类似 RedisConfig，略

    private ConfigSource configSource;

    public MysqlConfig(ConfigSource configSource) {
        this.configSource = configSource;
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
