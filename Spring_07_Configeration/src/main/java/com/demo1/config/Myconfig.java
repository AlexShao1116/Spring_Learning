package com.demo1.config;

import com.demo1.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration  //代表这是一个配置类
public class Myconfig {

    @Bean //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Dog dog11() {
        return new Dog("翠花");
    }
}

