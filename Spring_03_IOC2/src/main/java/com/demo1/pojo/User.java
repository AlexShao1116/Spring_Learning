package com.demo1.pojo;

public class User {

    private String name;

    public User() {
        System.out.println("user 的无参构造");
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = " + name);
    }

}
