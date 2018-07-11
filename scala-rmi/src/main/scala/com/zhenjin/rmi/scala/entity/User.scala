package com.zhenjin.rmi.scala.entity

/**
  * 用户实体
  *
  * @author ZhenJin
  * @param name 用户名程
  * @param sex  用户性别
  * @param age  用户年龄
  */
class User(name: String, sex: String, age: Int) extends Serializable {

  var userName: String = name

  var userSex: String = sex

  var userAge: Int = age

  override def toString = s"User(userName=$userName, userSex=$userSex, userAge=$userAge)"

}
