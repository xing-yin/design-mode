package com.singletonPattern.step1;

/**
 * Created by yinxing on 2018/7/31.
 */

/**
 * 创建一个 Singleton1 类
 */
public class SingleObject {

    // 创建SingleObject的一个对象
    private static SingleObject instance = new SingleObject();

    // 让构造函数为private,这样该类就不会被实例化
    private SingleObject() {
    }

    // 获取唯一可用对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello singleObject!");
    }

}
