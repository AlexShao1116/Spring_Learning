package com.shao.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("调用Mysql数据");
    }
}
