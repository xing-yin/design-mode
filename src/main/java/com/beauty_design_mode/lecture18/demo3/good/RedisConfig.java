package com.beauty_design_mode.lecture18.demo3.good;

import com.beauty_design_mode.lecture18.demo3.common.ConfigSource;
import lombok.Data;

import java.util.Map;

/**
 * 需求1：RedisConfig 和 KafkaConfig 需要定时更新相应的配置，MysqlConfig 不能更新配置
 * 需求2：RedisConfig 和 MysqlConfig 需要支持查看相应的配置，KafkaConfig 不能查看配置
 *
 * @author Alan Yin
 * @date 2021/8/11
 */
@Data
public class RedisConfig implements Updater, Viewer{

    /**
     * 配置中心（比如zookeeper）
     */
    private ConfigSource configSource;

    private String address;

    private int timeout;

    private int maxTotal;

    // 省略其他配置: maxWaitMillis,maxIdle,minIdle...

    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    @Override
    public void update() {
        //从configSource加载配置到address/timeout/maxTotal...
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
