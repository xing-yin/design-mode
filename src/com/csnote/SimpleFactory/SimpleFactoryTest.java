package com.csnote.SimpleFactory;

import com.csnote.SimpleFactory.src.Product;
import com.csnote.SimpleFactory.src.SimpleFactory;

/**
 * @author yinxing
 * @date 2019/3/25
 */

public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        // 利用简单工厂生成不同的子类
        Product product1 = simpleFactory.createProduct(1);
        Product product2 = simpleFactory.createProduct(2);
        Product product3 = simpleFactory.createProduct(3);
    }
}
