package com.demo1.pojo;
//��̬����ϵ��
public class Client{


    public static void main(String[] args) {
        Landlord landlord = new Landlord();

        Proxy proxy = new Proxy(landlord);


        proxy.rent();
    }


}
