package com.beauty_design_mode.lecture77.demo3;

/**
 * 参考 jdk Runtime 的单例模式实现
 *
 * @author Alan Yin
 * @date 2020/9/21
 */

public class MyRuntime {

    private static MyRuntime currentRuntime = new MyRuntime();

    private MyRuntime() {
    }

    public static MyRuntime getRuntime() {
        return currentRuntime;
    }

    public void addShutdownHook(Thread hook) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkPermission(new RuntimePermission("shutdownHook"));
        }
        // ApplicationShutdownHooks.add(hook);
    }

}
