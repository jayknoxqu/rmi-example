package com.zhenjin.rmi.naming.client;

import com.zhenjin.rmi.naming.facade.HelloNamingFacade;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * RMI客户端
 *
 * @author ZhenJin
 */
public class NamingClient {

    public static void main(String[] args) {
        try {
            String remoteAddr="rmi://localhost:1100/HelloNaming";
            HelloNamingFacade hello = (HelloNamingFacade) Naming.lookup(remoteAddr);
            String response = hello.helloWorld("ZhenJin");
            System.out.println("=======> " + response + " <=======");

        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }

    }

}
