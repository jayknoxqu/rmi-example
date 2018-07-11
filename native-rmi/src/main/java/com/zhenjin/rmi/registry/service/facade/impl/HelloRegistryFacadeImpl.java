package com.zhenjin.rmi.registry.service.facade.impl;


import com.zhenjin.rmi.registry.facade.HelloRegistryFacade;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * RMI服务接口实现
 * @author ZhenJin
 */
public class HelloRegistryFacadeImpl extends UnicastRemoteObject implements HelloRegistryFacade {


    public HelloRegistryFacadeImpl() throws RemoteException {
        super();
    }

    @Override
    public String helloWorld(String name) {
        return "[Registry] 你好! " + name;
    }

}
