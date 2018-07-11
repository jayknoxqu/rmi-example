package com.zhenjin.rmi.scala.service.facade.impl

import java.rmi.server.UnicastRemoteObject

import com.zhenjin.rmi.scala.entity.User
import com.zhenjin.rmi.scala.facade.UserScalaFacade

/**
  * RMI服务接口实现
  *
  * @author ZhenJin
  */
class UserScalaFacadeImpl extends UnicastRemoteObject with UserScalaFacade {

  /**
    * 模拟一个数据库表
    */
  private lazy val userList = List(
    new User("Jane", "女", 16),
    new User("jack", "男", 17),
    new User("ZhenJin", "男", 18)
  )

  override def getByName(userName: String): User = userList.filter(u => userName.equals(u.userName)).head

  override def getBySex(userSex: String): List[User] = userList.filter(u => userSex.equals(u.userSex))


}
