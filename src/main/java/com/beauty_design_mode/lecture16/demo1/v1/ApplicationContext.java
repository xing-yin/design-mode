package com.beauty_design_mode.lecture16.demo1.v1;

import com.beauty_design_mode.lecture16.demo1.suppoet.AlterRule;
import com.beauty_design_mode.lecture16.demo1.suppoet.Notification;

/**
 * ApplicationContext 是一个单例类，负责 Alert 的创建、组装（alertRule 和 notification 的依赖注入）、初始化（添加 handlers）工作。
 *
 * @author Alan Yin
 * @date 2021/8/6
 */

public class ApplicationContext {

    private AlterRule alterRule;
    private Notification notification;
    private Alert1 alert;

    public void initializeBeans() {
        alterRule = new AlterRule();
        notification = new Notification();
        alert = new Alert1();
        alert.addAlertHandler(new TpsAlertHandler(alterRule, notification));
        alert.addAlertHandler(new ErrorAlertHandler(alterRule, notification));
        // 改动三：注册 handler
        alert.addAlertHandler(new TimeoutAlertHandler(alterRule, notification));
    }

    private ApplicationContext() {
        this.initializeBeans();
    }

    /**
     * 饿汉式单例
     */
    private static final ApplicationContext APPLICATION_CONTEXT = new ApplicationContext();

    public static ApplicationContext getInstance() {
        return APPLICATION_CONTEXT;
    }

    public Alert1 getAlert() {
        return alert;
    }
}
