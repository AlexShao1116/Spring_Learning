package com.demo1.pojo;
//静态代理系列
public class Client{


    public static void main(String[] args) {
        Landlord landlord = new Landlord();

        Proxy proxy = new Proxy(landlord);


        proxy.rent();
    }


}
