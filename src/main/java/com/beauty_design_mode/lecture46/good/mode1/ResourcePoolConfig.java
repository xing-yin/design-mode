package com.beauty_design_mode.lecture46.good.mode1;

import com.beauty_design_mode.lecture25_26.support.StringUtils;

/**
 * 使用 Builder 模式:静态内部类实现
 *
 * @author Alan Yin
 * @date 2021/2/22
 */

public class ResourcePoolConfig {

    private String name;

    private int maxTotal;

    private int maxIdle;

    private int minIdle;

    public ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
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

    //我们将Builder类设计成了ResourcePoolConfig的内部类。
    //我们也可以将Builder类设计成独立的非内部类ResourcePoolConfigBuilder。
    public static class Builder {
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

        public Builder setName(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("name should not be empty");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxIdle should be positive");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle <= 0) {
                throw new IllegalArgumentException("maxIdle should be positive");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle <= 0) {
                throw new IllegalArgumentException("maxIdle should be positive");
            }
            this.minIdle = minIdle;
            return this;
        }

        /**
         * 校验逻辑放在 build 方法内部:包括必填项校验、依赖关系校验、约束条件校验等
         */
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
    }

    @Override
    public String toString() {
        return "ResourcePoolConfig{" +
                "name='" + name + '\'' +
                ", maxTotal=" + maxTotal +
                ", maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                '}';
    }

    public static void main(String[] args) {
        ResourcePoolConfig poolConfig = new ResourcePoolConfig.Builder()
                .setName("poolName")
                .build();
        System.out.println(poolConfig);
        ResourcePoolConfig poolConfig2 = new ResourcePoolConfig.Builder()
                .setName("poolName")
                .setMaxIdle(6)
                .build();
        System.out.println(poolConfig2);
    }
}

/**
 * 实现关键点：
 * 1.类的构造方法应该为 private
 * 2.Builder 类需要静态
 * 3.每一个参数设置完返回 this(即 builder 对象)
 * 4.所有需要校验或者依赖关系放在 build() 方法内
 */
