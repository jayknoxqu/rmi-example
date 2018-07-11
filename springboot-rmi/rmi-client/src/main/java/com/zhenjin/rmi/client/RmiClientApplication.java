package com.zhenjin.rmi.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * RMI客户端启动类
 * 由于rmi是在业务层调用的,如何和服务端通讯请参照 RmiClientTest
 * @author ZhenJin
 */
@SpringBootApplication
public class RmiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RmiClientApplication.class, args);
        System.out.println("================================");
        System.out.println("======= RMI客户端启动成功! =======");
        System.out.println("================================");
    }

}
