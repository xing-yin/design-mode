package com.headfirst.proxy.gumball;

import java.rmi.*;

public class GumballMonitor {
    GumballMachineRemote machine;

    // 构造器传入糖果机
    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    /**
     * 打印位置、库存、机器状态
     */
    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
