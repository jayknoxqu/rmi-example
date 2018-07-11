package com.zhenjin.rmi.client.config;

import com.zhenjin.rmi.facade.UserFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * RMI客户端配置
 *
 * @author ZhenJin
 */
@Configuration
public class RmiClientConfig {

    @Bean
    public UserFacade userInfo() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1101/UserInfo");
        rmiProxyFactoryBean.setServiceInterface(UserFacade.class);
        rmiProxyFactoryBean.afterPropertiesSet();
        return (UserFacade) rmiProxyFactoryBean.getObject();
    }

}
