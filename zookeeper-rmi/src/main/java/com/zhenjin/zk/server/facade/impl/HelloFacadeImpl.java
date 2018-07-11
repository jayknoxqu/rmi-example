package com.zhenjin.zk.server.facade.impl;

import com.zhenjin.zk.facade.HelloFacade;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * RMI服务实现
 */
public class HelloFacadeImpl extends UnicastRemoteObject implements HelloFacade {

    public HelloFacadeImpl() throws RemoteException {
        super();
    }

    @Override
    public String helloWorld(String name){
        return "[Zookeeper] 你好! " + name;
    }
}