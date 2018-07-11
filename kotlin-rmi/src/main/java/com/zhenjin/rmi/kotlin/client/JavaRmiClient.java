package com.zhenjin.rmi.kotlin.client;

import com.zhenjin.rmi.kotlin.facade.HelloKotlinFacade;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * JavaRmi客户端调用KotlinRmi服务端
 *
 * @author ZhenJin
 */
public class JavaRmiClient {

    public static void main(String[] args) {

        try {
            HelloKotlinFacade hello = (HelloKotlinFacade) Naming.lookup("rmi://localhost:1102/HelloKotlin");
            String response = hello.helloWorld("ZhenJin");
            System.out.println("=======> " + response + " <=======");

        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
