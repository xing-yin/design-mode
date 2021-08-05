package com.runoob.Builder.src.step2;

import com.runoob.Builder.src.step1.Product;

/**
 * @author yinxing
 * @date 2019/6/24
 */

public abstract class Builder {

    public abstract void buildePart1();

    public abstract void buildePart2();

    public abstract Product retrieveResult();

}
