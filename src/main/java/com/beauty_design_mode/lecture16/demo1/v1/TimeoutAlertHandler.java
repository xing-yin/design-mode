package com.beauty_design_mode.lecture16.demo1.v1;

import com.beauty_design_mode.lecture16.demo1.suppoet.AlterRule;
import com.beauty_design_mode.lecture16.demo1.suppoet.Notification;
import com.beauty_design_mode.lecture16.demo1.suppoet.NotificationEmergencyLevel;

/**
 * 改动二：添加新的handler
 *
 * @author Alan Yin
 * @date 2021/8/6
 */

public class TimeoutAlertHandler extends AlertHandler {

    /**
     * 对扩展开放，对修改关闭的演示：
     * 主要的改动有下面四处。
     * <p>
     * 第一处改动是：在 ApiStatInfo 类中添加新的属性 timeoutCount。
     * 第二处改动是：添加新的 TimeoutAlertHander 类。
     * 第三处改动是：在 ApplicationContext 类的 initializeBeans() 方法中，往 alert 对象中注册新的 timeoutAlertHandler。
     * 第四处改动是：在使用 Alert 类的时候，需要给 check() 函数的入参 apiStatInfo 对象设置 timeoutCount 的值。
     */

    public TimeoutAlertHandler(AlterRule alterRule, Notification notification) {
        super(alterRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getTimeoutCount() > alterRule.getMatchedRule(apiStatInfo.getApi()).getMaxTimeoutTps()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
