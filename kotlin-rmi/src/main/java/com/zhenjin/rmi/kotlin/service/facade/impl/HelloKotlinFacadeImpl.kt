package com.zhenjin.rmi.kotlin.service.facade.impl

import com.zhenjin.rmi.kotlin.facade.HelloKotlinFacade
import java.rmi.server.UnicastRemoteObject

/**
 * RMI服务接口实现
 * @author ZhenJin
 */
class HelloKotlinFacadeImpl : UnicastRemoteObject(), HelloKotlinFacade {

    override fun helloWorld(name: String): String? {
        return "[Kotlin] 你好! $name"
    }

}