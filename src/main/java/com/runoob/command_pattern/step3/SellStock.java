package com.runoob.command_pattern.step3;

import com.runoob.command_pattern.step1.Order;
import com.runoob.command_pattern.step2.Stock;

/**
 * Created by yinxing on 2018/8/21.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
