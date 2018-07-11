package com.zhenjin.zk.client;

import com.zhenjin.zk.client.consumer.RmiConsumer;
import com.zhenjin.zk.facade.HelloFacade;

/**
 * RMI客户端
 */
public class ZookeeperClient {

    public static void main(String[] args) throws Exception {
        RmiConsumer consumer = new RmiConsumer();

        while (true) {
            HelloFacade helloFacade = consumer.lookup();
            String result = helloFacade.helloWorld("Jack");
            System.out.println(result);
            Thread.sleep(3000);
        }
    }
}