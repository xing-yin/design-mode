package com.runoob.Builder.src.step3;

import com.runoob.Builder.src.step1.Product;
import com.runoob.Builder.src.step2.Builder;

/**
 * @author yinxing
 * @date 2019/6/24
 */

public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    /**
     * 产品零件建造方法
     */
    @Override
    public void buildePart1() {
        product.setPart1("第一个零件");
    }

    @Override
    public void buildePart2() {
        product.setPart2("第一个零件");
    }

    /**
     * 产品返回方法
     *
     * @return
     */
    @Override
    public Product retrieveResult() {
        return product;
    }
}
