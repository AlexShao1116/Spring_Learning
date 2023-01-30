package com.shao.service;

import com.shao.dao.UserDao;
import com.shao.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    //放宽业务层要求，只计入接口类型，不指定实现类
    private UserDao userDao;
    //动态注入，此方法为控制反转关键
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
