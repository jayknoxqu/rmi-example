package com.zhenjin.zk.server;

import com.zhenjin.zk.facade.HelloFacade;
import com.zhenjin.zk.server.facade.impl.HelloFacadeImpl;
import com.zhenjin.zk.server.provider.RmiProvider;

/**
 * 服务发布
 * @see "http://www.importnew.com/20344.html"
 */
public class ZookeeperServer {

    public static void main(String[] args) throws Exception {
        RmiProvider provider = new RmiProvider();
        HelloFacade helloFacade = new HelloFacadeImpl();
        provider.publish(helloFacade, "localhost", 1099);
    }

}