package com.zhenjin.rmi.registry.client;

import com.zhenjin.rmi.registry.facade.HelloRegistryFacade;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * RMI客户端
 *
 * @author ZhenJin
 */
public class RegistryClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            HelloRegistryFacade hello = (HelloRegistryFacade) registry.lookup("HelloRegistry");
            String response = hello.helloWorld("ZhenJin");
            System.out.println("=======> " + response + " <=======");
        } catch (NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }

}
