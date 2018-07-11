package com.zhenjin.rmi.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * RMI服务端启动类
 *
 * @author ZhenJin
 */
@SpringBootApplication
public class RmiServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(RmiServiceApplication.class, args);

        System.out.println("================================");
        System.out.println("======= 启动RMI服务成功! =======");
        System.out.println("================================");
    }

}
