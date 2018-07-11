package com.zhenjin.rmi.scala.service

import java.io.IOException
import java.rmi.Naming
import java.rmi.registry.LocateRegistry

import com.zhenjin.rmi.scala.facade.UserScalaFacade
import com.zhenjin.rmi.scala.service.facade.impl.UserScalaFacadeImpl

/**
  * ScalaRmi服务端
  *
  * @author ZhenJin
  */
object ScalaRmiService extends App {

  try {

    val user: UserScalaFacade = new UserScalaFacadeImpl

    LocateRegistry.createRegistry(1103)

    Naming.rebind("rmi://localhost:1103/UserScala", user)

    println("======= 启动RMI服务成功! =======")

  } catch {
    case e: IOException => println(e)
  }

}