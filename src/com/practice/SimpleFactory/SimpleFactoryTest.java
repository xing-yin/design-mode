package com.practice.SimpleFactory;

import com.practice.SimpleFactory.src.Product;
import com.practice.SimpleFactory.src.SimpleFactory;

/**
 * @author yinxing
 * @date 2019/6/20
 */

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Product product1 = SimpleFactory.createProduct(1);
        Product product2 = SimpleFactory.createProduct(2);
        Product product3 = SimpleFactory.createProduct(3);
        System.out.println("product1:" + product1.getClass().getName());
        System.out.println("product2:" + product2.getClass().getName());
        System.out.println("product3:" + product3.getClass().getName());
    }
}
