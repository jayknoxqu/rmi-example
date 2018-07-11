package com.zhenjin.rmi.service.facade.impl;


import com.zhenjin.rmi.entity.User;
import com.zhenjin.rmi.facade.UserFacade;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * RMI服务接口实现
 *
 * @author ZhenJin
 */
@Service
public class UserFacadeImpl implements UserFacade {

    private List<User> userList;

    {
        //模拟一个数据库
        User jane = new User("Jane", "女", 16);
        User jack = new User("jack", "男", 17);
        User zhenJin = new User("ZhenJin", "男", 18);
        userList = Arrays.asList(jane, jack, zhenJin);
    }


    @Override
    public User getByName(String userName) {
        //根据用户名从数据库取出对应的用户信息
        Supplier<NullPointerException> exception = () -> new NullPointerException("找不到" + userName + ",这个用户的信息!");
        return userList.stream().filter(t -> t.getUserName().equals(userName)).findFirst().orElseThrow(exception);
    }


    @Override
    public List<User> getBySex(String userSex) {
        //根据用户名从数据库取出对应的用户信息
        return userList.stream().filter(t -> t.getUserSex().equals(userSex)).collect(Collectors.toList());
    }

}
