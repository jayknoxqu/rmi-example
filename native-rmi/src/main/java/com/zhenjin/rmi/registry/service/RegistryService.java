package com.zhenjin.rmi.registry.service;

import com.zhenjin.rmi.registry.facade.HelloRegistryFacade;
import com.zhenjin.rmi.registry.service.facade.impl.HelloRegistryFacadeImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * RMI服务端
 * @author ZhenJin
 * @see "http://download.oracle.com/technetwork/java/javase/6/docs/zh/api/java/rmi/registry/Registry.html"
 */
public class RegistryService {

    public static void main(String[] args) {

        try {

            // 本地主机上的远程对象注册表Registry的实例,默认端口1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // 创建一个远程对象
            HelloRegistryFacade hello = new HelloRegistryFacadeImpl();

            // 把远程对象注册到RMI注册服务器上，并命名为HelloRegistry
            registry.rebind("HelloRegistry", hello);

            System.out.println("======= 启动RMI服务成功! =======");

        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

}
