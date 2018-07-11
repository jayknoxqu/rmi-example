package com.zhenjin.rmi.kotlin.client

import com.zhenjin.rmi.kotlin.facade.HelloKotlinFacade
import java.net.MalformedURLException
import java.rmi.Naming
import java.rmi.NotBoundException
import java.rmi.RemoteException

/**
 * RMI客户端
 * @author ZhenJin
 */
fun main(args: Array<String>) {
    try {

        val hello = Naming.lookup("rmi://localhost:1102/HelloKotlin") as HelloKotlinFacade

        val response = hello.helloWorld("ZhenJin")

        println("=======> $response <=======")

    } catch (e: NotBoundException) {
        e.printStackTrace()
    } catch (e: RemoteException) {
        e.printStackTrace()
    } catch (e: MalformedURLException) {
        e.printStackTrace()
    }

}

