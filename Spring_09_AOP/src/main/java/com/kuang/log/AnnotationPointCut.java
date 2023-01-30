package com.kuang.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//����ʽ����
@Aspect //��ע�������һ������
public class AnnotationPointCut {

    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("====����ִ��ǰ====");
    }

    @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("====����ִ�к�====");
    }

    //�ڻ�����ǿ�У����ǿ��Ը���һ����������������Ҫ��ȡ��������ĵ㣻
    @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("����ǰ");

        Signature signature = jp.getSignature();// ���ǩ��
        System.out.println("signature:"+signature);

        Object proceed = jp.proceed(); //ִ�з���

        System.out.println("���ƺ�");

        System.out.println(proceed);
    }

}

