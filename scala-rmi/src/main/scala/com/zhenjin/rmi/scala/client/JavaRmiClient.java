package com.zhenjin.rmi.scala.client;


import com.zhenjin.rmi.scala.entity.User;
import com.zhenjin.rmi.scala.facade.UserScalaFacade;
import scala.collection.immutable.List;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * JavaRmi客户端调用ScalaRmi服务端
 *
 * @author ZhenJin
 */
public class JavaRmiClient {

    public static void main(String[] args) {

        try {
            UserScalaFacade userFacade = (UserScalaFacade) Naming.lookup("rmi://localhost:1103/UserScala");

            User zhenJin = userFacade.getByName("ZhenJin");
            System.out.println(zhenJin);

            System.out.println("--------------------------------------");

            List<User> userList = userFacade.getBySex("男");
            System.out.println(userList);

        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }

    }

}