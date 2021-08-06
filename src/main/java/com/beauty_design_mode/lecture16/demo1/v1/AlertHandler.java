package com.beauty_design_mode.lecture16.demo1.v1;

import com.beauty_design_mode.lecture16.demo1.suppoet.AlterRule;
import com.beauty_design_mode.lecture16.demo1.suppoet.Notification;

/**
 * 2.定义接口或抽象类
 * <p>
 * //代码未改动
 *
 * @author Alan Yin
 * @date 2021/8/6
 */

public abstract class AlertHandler {

    protected AlterRule alterRule;

    protected Notification notification;

    public AlertHandler(AlterRule alterRule, Notification notification) {
        this.alterRule = alterRule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);

}
