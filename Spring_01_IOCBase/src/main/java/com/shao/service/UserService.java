package com.shao.service;

import com.shao.dao.UserDao;
import com.shao.dao.UserDaoImpl;

public interface UserService{
    public void getUser();
    public void setUserDao(UserDao object);
}
