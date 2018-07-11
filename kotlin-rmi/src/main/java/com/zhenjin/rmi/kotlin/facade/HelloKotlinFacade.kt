package com.zhenjin.rmi.kotlin.facade

import java.rmi.Remote
import java.rmi.RemoteException

interface HelloKotlinFacade : Remote {

    @Throws(RemoteException::class)
    fun helloWorld(name: String): String?

}