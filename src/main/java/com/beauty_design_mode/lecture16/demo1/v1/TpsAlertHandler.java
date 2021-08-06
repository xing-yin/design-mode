package com.beauty_design_mode.lecture16.demo1.v1;

import com.beauty_design_mode.lecture16.demo1.suppoet.AlterRule;
import com.beauty_design_mode.lecture16.demo1.suppoet.Notification;
import com.beauty_design_mode.lecture16.demo1.suppoet.NotificationEmergencyLevel;

/**
 * @author Alan Yin
 * @date 2021/8/6
 */

public class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(AlterRule alterRule, Notification notification) {
        super(alterRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > alterRule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }

}
