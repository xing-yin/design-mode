package com.runoob.commandPattern.step3;

import com.runoob.commandPattern.step1.Order;
import com.runoob.commandPattern.step2.Stock;

/**
 * Created by yinxing on 2018/8/21.
 */

/**
 * 步骤 3
 * 创建实现了 Order 接口的实体类。
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
