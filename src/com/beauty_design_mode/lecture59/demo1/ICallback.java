package com.beauty_design_mode.lecture59.demo1;

/**
 * 回调接口
 *
 * @author Alan Yin
 * @date 2020/3/23
 */

/**
 * 什么是回调？
 * 相对于普通的函数调用来说，回调是一种双向调用关系。
 * A 类事先注册某个函数 F 到 B 类，A 类在调用 B 类的 P 函数的时候，B 类反过来调用 A 类注册给它的 F 函数。
 * 这里的 F 函数就是“回调函数”。
 * A 调用 B，B 反过来又调用 A，这种调用机制就叫作“回调”。
 */
public interface ICallback {

    void mehthodToCallback();
}
