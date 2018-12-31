package com.runoob.commandPattern.step4;

/**
 * Created by yinxing on 2018/8/21.
 */

import com.runoob.commandPattern.step1.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤 4
 * 创建命令调用类
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
