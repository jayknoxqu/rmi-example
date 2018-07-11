package com.zhenjin.rmi.scala.facade

import java.rmi.{Remote, RemoteException}

import com.zhenjin.rmi.scala.entity.User

/**
  * RMI服务接口
  * @author ZhenJin
  */
trait UserScalaFacade extends Remote {

  /**
    * 通过用户名获取用户信息
    *
    * @param userName 用户名
    * @throws java.rmi.RemoteException 远程调用异常
    * @return 用户信息
    */
  @throws(classOf[RemoteException])
  def getByName(userName: String): User

  /**
    * 通过用户性别获取用户信息
    *
    * @param userSex 用户性别
    * @throws java.rmi.RemoteException 远程调用异常
    * @return 用户列表
    */
  @throws(classOf[RemoteException])
  def getBySex(userSex: String): List[User]

}
