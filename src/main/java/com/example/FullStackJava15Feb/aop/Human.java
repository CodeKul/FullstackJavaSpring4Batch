package com.example.FullStackJava15Feb.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    @Before("execution(public * study*(..))")
    public void wakeUp(){
        System.out.println("Wake up");
    }

    @After("execution(public * study*(..))")
    public void sleep(){
        System.out.println("Sleep");
    }

    @Pointcut("execution(public * study*(..))")
    public void myPointCut(){}


}
