package com.beauty_design_mode.lecture60.demo2.key;

import com.beauty_design_mode.lecture60.demo2.EvictionStrategy;
import com.beauty_design_mode.lecture60.demo2.EvictionStrategyFactory;
import com.beauty_design_mode.lecture60.demo2.UserCache;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 运行时动态确定，根据配置文件的配置决定使用哪种策略:更加灵活
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class RuntimeApplication {

    public static void main(String[] args) throws IOException {
        EvictionStrategy evictionStrategy = null;
        Properties props = new Properties();
        props.load(new FileInputStream("./config.properties"));
        String type = props.getProperty("evictionType");
        evictionStrategy = EvictionStrategyFactory.getStrategy(type);
        UserCache userCache = new UserCache(evictionStrategy);
    }
}
