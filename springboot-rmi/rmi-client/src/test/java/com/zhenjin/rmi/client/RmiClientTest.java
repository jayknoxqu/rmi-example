package com.zhenjin.rmi.client;

import com.zhenjin.rmi.entity.User;
import com.zhenjin.rmi.facade.UserFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.rmi.RemoteException;
import java.util.List;

/**
 * 测试类
 *
 * @author ZhenJin
 */
@RunWith(SpringRunner.class)
// 在SpringBootTest注解中不能加参数
// webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
// 否则会报 UnsatisfiedDependencyException: Error creating bean with name
@SpringBootTest(classes = RmiClientApplication.class)
public class RmiClientTest {

    @Autowired
    private UserFacade userFacade;

    @Test
    public void userByNameTest() {
        try {
            User zhenJin = userFacade.getByName("ZhenJin");
            System.out.println("=======> " + zhenJin + " <=======");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void userBySexTest() {
        try {
            List<User> userList = userFacade.getBySex("男");
            userList.forEach(System.out::println);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
