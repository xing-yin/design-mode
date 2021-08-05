package com.beauty_design_mode.lecture59.demo2;

/**
 * 应用举例三：addShutdownHook()
 *
 * @author Alan Yin
 * @date 2020/3/23
 */

/**
 * Hook 比较经典的应用场景是 Tomcat 和 JVM 的 shutdown hook。
 * 接下来，我们拿 JVM 来举例说明一下。
 * JVM 提供了 Runtime.addShutdownHook(Thread hook) 方法，可以注册一个 JVM 关闭的 Hook。
 * 当应用程序关闭的时候，JVM 会自动调用 Hook 代码。
 */
public class ShutdownHookDemo {

    private static class ShutdownHook extends Thread {
        @Override
        public void run() {
            System.out.println("I am called during shutting down");
        }
    }

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
    }
}
