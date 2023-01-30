package com.demo1.pojo;

public class Landlord implements Rent{

    @Override
    public void rent() {
        System.out.println("Renting house by Landlord");
    }
}
