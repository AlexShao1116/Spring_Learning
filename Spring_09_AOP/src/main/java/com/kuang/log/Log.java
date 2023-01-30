package com.kuang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    //method: Ҫִ�е�Ŀ�����ķ���
    //args������
    //target��Ŀ�����
    public void before(Method method, Object[] agrs, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"��"+method.getName()+"��ִ����");
    }
}
