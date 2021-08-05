package com.beauty_design_mode.lecture60.demo2.key;

import com.beauty_design_mode.lecture60.demo2.EvictionStrategy;
import com.beauty_design_mode.lecture60.demo2.LruEvictionStrategy;
import com.beauty_design_mode.lecture60.demo2.UserCache;

/**
 * 非运行时动态确定，在代码中指定使用哪种策略
 *
 * @author Alan Yin
 * @date 2020/3/24
 */

public class StaticApplication {

    public static void main(String[] args) {
        EvictionStrategy evictionStrategy = new LruEvictionStrategy();
        UserCache userCache = new UserCache(evictionStrategy);
    }
}
