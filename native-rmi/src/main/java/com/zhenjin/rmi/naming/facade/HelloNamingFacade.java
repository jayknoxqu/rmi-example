package com.zhenjin.rmi.naming.facade;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMI服务接口
 *
 * @author ZhenJin
 */
public interface HelloNamingFacade extends Remote {

    /**
     * 远程调用接口
     *
     * @param name 远程传入的参数
     * @return 服务端处理的数据
     * @throws RemoteException 远程调用异常
     */
    String helloWorld(String name) throws RemoteException;

}
