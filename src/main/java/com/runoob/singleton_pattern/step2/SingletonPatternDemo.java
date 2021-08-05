package com.runoob.singleton_pattern.step2;

/**
 * Created by yinxing on 2018/8/1.
 */

import com.runoob.singleton_pattern.step1.SingleObject;

/**
 * 从 singleton 类获取唯一的对象
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject singleObject =new SingleObject();

        // 获取唯一可用的对象
        SingleObject singleObject = SingleObject.getInstance();

        //显示消息
        singleObject.showMessage();

    }
}
