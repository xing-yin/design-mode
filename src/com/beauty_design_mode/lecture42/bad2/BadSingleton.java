package com.beauty_design_mode.lecture42.bad2;

/**
 * 代码实现有点问题:
 * <p>
 * 如果我们如下两次执行 getInstance() 方法，那获取到的 singleton1 和 signleton2 的 paramA 和 paramB 都是 10 和 50。
 * 也就是说，第二次的参数（20，30）没有起作用，而构建的过程也没有给与提示，这样就会误导用户。
 *
 * @author Alan Yin
 * @date 2021/1/17
 */

public class BadSingleton {

    private static BadSingleton instance = null;

    private final int paramA;
    private final int paramB;

    private BadSingleton(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public synchronized static BadSingleton getInstance(int paramA, int paramB) {
        if (instance == null) {
            instance = new BadSingleton(paramA, paramB);
        }
        return instance;
    }

    public static void main(String[] args) {
        BadSingleton badSingleton = BadSingleton.getInstance(10, 30);
    }
}
