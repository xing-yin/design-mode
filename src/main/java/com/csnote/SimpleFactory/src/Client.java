package com.csnote.SimpleFactory.src;

/**
 * 错误示例：
 * <p>
 * 以下的 Client 类包含了实例化的代码，这是一种错误的实现。如果在客户类中存在这种实例化代码，就需要考虑将代码放到简单工厂中
 */
public class Client {

    public static void main(String[] args) {

        int type = 1;

        Product product;

        /**
         * 错误示例:客户类和具体子类的没有实现解耦，客户类需要知道有哪些子类以及应当实例化哪个子类。
         *
         *  客户类往往有多个，如果不使用简单工厂，那么所有的客户类都要知道所有子类的细节。
         *
         *  而且一旦子类发生改变，例如增加子类，那么所有的客户类都要进行修改。
         */
        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct3();
        }
    }
}
