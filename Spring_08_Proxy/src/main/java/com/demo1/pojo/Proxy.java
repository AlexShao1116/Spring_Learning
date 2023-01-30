package com.demo1.pojo;

public class Proxy implements Rent{

    private Landlord landlord;

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        seehouse();
        signContract();
        landlord.rent();

    }
    public void seehouse(){
        System.out.println("proxy seehouse");
    }
    public void signContract(){
        System.out.println("proxy signContract");
    }
}
