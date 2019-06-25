package com.runoob.Builder.src.step4;

import com.runoob.Builder.src.step2.Builder;

/**
 * 导演类
 *
 * @author yinxing
 * @date 2019/6/24
 */

public class Director {

    /**
     * 持有当前需要使用的构建者对象
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件的建造方法
     */
    public void construct() {
        builder.buildePart1();
        builder.buildePart2();
    }

}
