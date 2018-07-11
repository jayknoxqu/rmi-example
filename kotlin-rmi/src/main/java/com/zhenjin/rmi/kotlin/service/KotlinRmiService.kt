package com.zhenjin.rmi.kotlin.service

import com.zhenjin.rmi.kotlin.facade.HelloKotlinFacade
import com.zhenjin.rmi.kotlin.service.facade.impl.HelloKotlinFacadeImpl
import java.io.IOException
import java.rmi.Naming
import java.rmi.registry.LocateRegistry

/**
 * KotlinRmi服务端
 * @author ZhenJin
 */

fun main(args: Array<String>) {

    try {
        val hello: HelloKotlinFacade = HelloKotlinFacadeImpl()
        LocateRegistry.createRegistry(1102)
        Naming.rebind("rmi://localhost:1101/HelloKotlin", hello)

        println("======= 启动RMI服务成功! =======")

    } catch (e: IOException) {
        e.printStackTrace()
    }
}

