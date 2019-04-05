package com.headfirst.proxy.gumball;

import java.rmi.*;

/**
 * 服务辅助类
 * 制作远程接口
 */
public interface GumballMachineRemote extends Remote {

    /**
     * 所有的返回类型必须是原语类型或可序列化类型
     *
     * @return
     * @throws RemoteException
     */
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
