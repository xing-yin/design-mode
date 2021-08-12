package com.beauty_design_mode.lecture18.demo3.good;

import com.beauty_design_mode.lecture18.demo3.common.ConfigSource;
import com.beauty_design_mode.lecture18.demo3.common.ZookeeperConfigSource;

/**
 * @author Alan Yin
 * @date 2021/8/12
 */

public class Demo {

    public static void main(String[] args) {
        // 演示1：
        ConfigSource configSource = new ZookeeperConfigSource();
        RedisConfig redisConfig = new RedisConfig(configSource);
        ScheduledUpdater redisUpdater = new ScheduledUpdater(redisConfig, 300, 100);
        redisUpdater.run();

        KafkaConfig kafkaConfig = new KafkaConfig(configSource);
        ScheduledUpdater kafkaUpdater = new ScheduledUpdater(kafkaConfig, 80, 40);
        kafkaUpdater.run();

        // 演示2：
        MysqlConfig mysqlConfig = new MysqlConfig(configSource);
        SimpleHttpServer simpleHttpServer = new SimpleHttpServer("127.0.0.1", 8086);
        simpleHttpServer.addViewers("/config", redisConfig);
        simpleHttpServer.addViewers("/config", mysqlConfig);
        simpleHttpServer.run();
    }

}
