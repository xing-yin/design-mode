package com.beauty_design_mode.lecture16.demo1.suppoet;

/**
 * @author Alan Yin
 * @date 2021/8/6
 */

public class Notification {

    public void notify(NotificationEmergencyLevel emergencyLevel, String message) {
        System.out.println("NotificationEmergencyLevel:" + emergencyLevel + ";message:" + message);
    }
}
