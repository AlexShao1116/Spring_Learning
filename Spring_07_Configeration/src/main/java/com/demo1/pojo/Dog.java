package com.demo1.pojo;


import org.springframework.stereotype.Component;

@Component
public class Dog {
   /* @Value("旺财")*/
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
