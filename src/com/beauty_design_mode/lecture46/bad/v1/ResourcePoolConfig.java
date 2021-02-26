package com.beauty_design_mode.lecture46.bad.v1;

import com.beauty_design_mode.lecture25_26.support.StringUtils;

/**
 * 面试题：我们需要定义一个资源池配置类 ResourcePoolConfig。这里的资源池，你可以简单理解为线程池、连接池、对象池等。
 * <p>
 * 在这个资源池配置类中，有以下几个成员变量，也就是可配置项:name(必填，默认无)、maxTotal(非必填，默认8)、maxIdle(非必填，默认8)、minIdle(非必填，默认0)
 *
 * @author Alan Yin
 * @date 2021/2/22
 */

public class ResourcePoolConfig {

    /**
     * 默认值
     */
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    private String name;

    private int maxTotal = DEFAULT_MAX_TOTAL;

    private int maxIdle = DEFAULT_MAX_IDLE;

    private int minIdle = DEFAULT_MIN_IDLE;

    public ResourcePoolConfig(String name, Integer maxTotal, Integer maxIdle, Integer minIdle) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty");
        }
        this.name = name;

        if (maxTotal != null) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxTotal should be positive");
            }
            this.maxTotal = maxTotal;
        }

        if (maxIdle != null) {
            if (maxIdle <= 0) {
                throw new IllegalArgumentException("maxIdle should be positive");
            }
            this.maxIdle = maxIdle;
        }

        if (minIdle != null) {
            if (minIdle <= 0) {
                throw new IllegalArgumentException("minIdle should be positive");
            }
            this.minIdle = minIdle;
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public static void main(String[] args) {
        // 如果参数太多，导致可读性差、参数可能传递错误
        ResourcePoolConfig poolConfig = new ResourcePoolConfig("poolName", 8, 4, 4);
    }
}
