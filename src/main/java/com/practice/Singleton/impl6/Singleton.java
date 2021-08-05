package com.practice.Singleton.impl6;

/**
 * 枚举实现-线程安全
 * <p>
 * 在多次序列化再进行反序列化之后，不会得到多个实例；
 * 能够防止反射攻击；
 * effective java 推荐的最佳实践
 *
 * @author yinxing
 * @date 2019/6/20
 */

public enum Singleton {

    /**
     * 单例
     */
    UNIQUE_INSTANCE;

}
