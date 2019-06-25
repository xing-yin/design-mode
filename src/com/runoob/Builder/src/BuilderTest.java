package com.runoob.Builder.src;

import com.runoob.Builder.src.step1.Product;
import com.runoob.Builder.src.step2.Builder;
import com.runoob.Builder.src.step3.ConcreteBuilder;
import com.runoob.Builder.src.step4.Director;

/**
 * @author yinxing
 * @date 2019/6/24
 */

public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println("part1: " + product.getPart1());
        System.out.println("part2: " + product.getPart2());
    }
}
