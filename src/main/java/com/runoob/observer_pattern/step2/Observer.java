package com.runoob.observer_pattern.step2;

import com.runoob.observer_pattern.step1.Subject;

/**
 * Created by yinxing on 2018/8/8.
 */

/**
 * 步骤 2
 * 创建 Observer 类
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
