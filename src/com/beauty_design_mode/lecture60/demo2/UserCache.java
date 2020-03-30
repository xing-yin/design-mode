package com.beauty_design_mode.lecture60.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alan Yin
 * @date 2020/3/24
 */

public class UserCache {

    private Map<String,User> cacheData = new HashMap<>();

    private EvictionStrategy evictionStrategy;

    public UserCache(EvictionStrategy evictionStrategy) {
        this.evictionStrategy = evictionStrategy;
    }
}
