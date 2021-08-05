package com.beauty_design_mode.lecture46.good.mode2;

import com.beauty_design_mode.lecture25_26.support.StringUtils;

/**
 * 使用 Builder 模式:独立的非内部类实现
 *
 * @author Alan Yin
 * @date 2021/2/22
 */

public class ResourcePoolConfigBuilder {

    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;

    public ResourcePoolConfigBuilder setName(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty");
        }
        this.name = name;
        return this;
    }

    public ResourcePoolConfigBuilder setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("maxIdle should be positive");
        }
        this.maxTotal = maxTotal;
        return this;
    }

    public ResourcePoolConfigBuilder setMaxIdle(int maxIdle) {
        if (maxIdle <= 0) {
            throw new IllegalArgumentException("maxIdle should be positive");
        }
        this.maxIdle = maxIdle;
        return this;
    }

    public ResourcePoolConfigBuilder setMinIdle(int minIdle) {
        if (minIdle <= 0) {
            throw new IllegalArgumentException("minIdle should be positive");
        }
        this.minIdle = minIdle;
        return this;
    }

    public ResourcePoolConfig build() {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty");
        }
        if (maxIdle > maxTotal || minIdle > maxTotal) {
            throw new IllegalArgumentException("maxIdle and minIdle should be less than maxTotal");
        }
        if (minIdle > maxIdle) {
            throw new IllegalArgumentException("minIdle should be less than maxIdle");
        }
        return new ResourcePoolConfig(this);
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
        ResourcePoolConfig poolConfig1 = new ResourcePoolConfigBuilder()
                .setName("poolName")
                .build();
        System.out.println(poolConfig1);
        ResourcePoolConfig poolConfig2 = new ResourcePoolConfigBuilder()
                .setName("poolName")
                .setMaxIdle(6)
                .build();
        System.out.println(poolConfig2);
    }
}
