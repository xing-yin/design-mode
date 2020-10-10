package com.beauty_design_mode.lecture86.demo1;

/**
 * 参考 spring AopProxy
 *
 * @author Alan Yin
 * @date 2020/9/21
 */

public interface MyAopProxy {

    Object getProxy();

    Object getProxy(ClassLoader classLoader);

}
