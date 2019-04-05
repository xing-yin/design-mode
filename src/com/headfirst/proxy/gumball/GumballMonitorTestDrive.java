package com.headfirst.proxy.gumball;

import java.rmi.*;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://seattle.mightygumball.com/gumballmachine"};

        if (args.length >= 0) {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumballmachine";
        }

        /**
         * 创建监视器的数组
         */
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                // 为每个远程机器创建一个代理
                // Naming.lookup()从参数中得知位置和服务名称，然后在该位置的rmiregistry中寻找该名称的服务
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
