package com.shao.dao;

public class UserDaoImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("调用dao用户方法");
    }
}
