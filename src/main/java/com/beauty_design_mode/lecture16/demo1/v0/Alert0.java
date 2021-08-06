package com.beauty_design_mode.lecture16.demo1.v0;

import com.beauty_design_mode.lecture16.demo1.suppoet.AlterRule;
import com.beauty_design_mode.lecture16.demo1.suppoet.Notification;
import com.beauty_design_mode.lecture16.demo1.suppoet.NotificationEmergencyLevel;

/**
 * 开闭原则演示
 *
 * @author Alan Yin
 * @date 2021/8/6
 */

public class Alert0 {

    //================================== V1.0 ==================================
    // 预警规则
    private AlterRule rule;
    // 通知类
    private Notification notification;

    public Alert0(AlterRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }

    //================================== V2.0(反例演示) ==================================

    /**
     * 现在，如果我们需要添加一个功能，当每秒钟接口超时请求个数，超过某个预先设置的最大阈值时，我们也要触发告警发送通知。
     * 这个时候，我们该如何改动代码呢？
     * <p>
     * 主要的改动有两处：
     * - 第一处是修改 check() 函数的入参，添加一个新的统计数据 timeoutCount，表示超时接口请求数；
     * - 第二处是在 check() 函数中添加新的告警逻辑。
     */
    // 改动一：添加参数timeoutCount
    public void check(String api, long requestCount, long errorCount, long timeoutCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
        // 改动二：添加接口超时处理逻辑
        long timeoutTps = timeoutCount / durationOfSeconds;
        if (timeoutTps > rule.getMatchedRule(api).getMaxTimeoutTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }


}
