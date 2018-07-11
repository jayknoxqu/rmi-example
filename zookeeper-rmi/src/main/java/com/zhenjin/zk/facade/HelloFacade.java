package com.zhenjin.zk.facade;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMI服务接口
 */
public interface HelloFacade extends Remote {

    String helloWorld(String name) throws RemoteException;

}