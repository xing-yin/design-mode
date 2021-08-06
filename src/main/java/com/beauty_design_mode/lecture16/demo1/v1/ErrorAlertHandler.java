package com.beauty_design_mode.lecture16.demo1.v1;

import com.beauty_design_mode.lecture16.demo1.suppoet.AlterRule;
import com.beauty_design_mode.lecture16.demo1.suppoet.Notification;
import com.beauty_design_mode.lecture16.demo1.suppoet.NotificationEmergencyLevel;

/**
 * @author Alan Yin
 * @date 2021/8/6
 */

public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlterRule alterRule, Notification notification) {
        super(alterRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > alterRule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
