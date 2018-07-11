package com.zhenjin.rmi.naming.service.facade.impl;


import com.zhenjin.rmi.naming.facade.HelloNamingFacade;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * RMI服务接口实现
 *
 * @author ZhenJin
 */
public class HelloNamingFacadeImpl extends UnicastRemoteObject implements HelloNamingFacade {


    public HelloNamingFacadeImpl() throws RemoteException {
        super();
    }

    @Override
    public String helloWorld(String name) {
        return "[Naming] 你好! " + name;
    }


}
