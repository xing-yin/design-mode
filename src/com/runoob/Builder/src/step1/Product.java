package com.runoob.Builder.src.step1;

/**
 * 产品类Product
 * <p>
 * 这是最终想要构建出来的复杂对象
 *
 * @author yinxing
 * @date 2019/6/24
 */

public class Product {

    /**
     * 定义一些关于产品的操作
     */
    private String part1;

    private String part2;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }
}
