package com.zhenjin.rmi.scala.client

import java.net.MalformedURLException
import java.rmi.{Naming, NotBoundException, RemoteException}

import com.zhenjin.rmi.scala.facade.UserScalaFacade

/**
  * ScalaRmi客户端
  *
  * @author ZhenJin
  */
object ScalaRmiClient extends App {

  try {
    val userFacade = Naming.lookup("rmi://localhost:1103/UserScala").asInstanceOf[UserScalaFacade]

    println(userFacade.getByName("ZhenJin"))

    System.out.println("--------------------------------------")

    for (user <- userFacade.getBySex("男")) println(user)

  } catch {
    case e: NotBoundException => println(e)
    case e: RemoteException => println(e)
    case e: MalformedURLException => println(e)
  }

}