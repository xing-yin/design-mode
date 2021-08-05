package com.beauty_design_mode.lecture50.example;

import java.io.*;

/**
 * 从 Java IO 的设计来看，装饰器模式相对于简单的组合关系，还有两个比较特殊的地方：
 *
 * @author Alan Yin
 * @date 2021/2/25
 */

public class InputStreamExample {

    /**
     * 特殊的地方1：装饰器类和原始类继承同样的父类，可以对原始类“嵌套”多个装饰器类
     *
     * @throws IOException
     */
    private void test1() throws IOException {
        InputStream in = new FileInputStream("/user/path");
        InputStream bin = new BufferedInputStream(in);
        DataInputStream din = new DataInputStream(bin);
        int data = din.readInt();
    }

    /**
     * 特殊的地方2：装饰器类是对功能的增强，这也是装饰器模式应用场景的一个重要特点
     */
    public interface IA {
        void f();
    }

    public class A implements IA {
        @Override
        public void f() {
            //...
        }
    }

    /**
     * 代理模式的代码结构（接口也可以换做抽象类）
     */
    public class AProxy implements IA {

        private IA a;

        public AProxy(A a) {
            this.a = a;
        }

        @Override
        public void f() {
            // 新添加的代理逻辑
            a.f();
            // 新添加的代理逻辑
        }
    }

    /**
     * 装饰器模式的代码结构（接口也可以换做抽象类）
     */
    public class ADecorator implements IA {
        private IA a;

        public ADecorator(IA a) {
            this.a = a;
        }

        @Override
        public void f() {
            // 意图不同点
            // 功能增强代码
            a.f();
            // 功能增强代码
        }
    }
}
