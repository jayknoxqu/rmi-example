package com.zhenjin.rmi.service.config;

import com.zhenjin.rmi.facade.UserFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * RMI服务端配置
 *
 * @author ZhenJin
 */
@Configuration
public class RmiServiceConfig {

    @Bean
    public RmiServiceExporter registerService(UserFacade userFacade) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("UserInfo");
        rmiServiceExporter.setService(userFacade);
        rmiServiceExporter.setServiceInterface(UserFacade.class);
        rmiServiceExporter.setRegistryPort(1101);
        return rmiServiceExporter;
    }

}
