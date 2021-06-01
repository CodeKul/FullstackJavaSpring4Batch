package com.example.FullStackJava15Feb.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class Human {

    @Before("execution(public void com.example.FullStackJava15Feb.aop.BoyStudent.study())")
    public void wakeUp(){
        System.out.println("Wake up");
    }


    @After("execution(public void com.example.FullStackJava15Feb.aop.BoyStudent.study())")
    public void sleep(){
        System.out.println("Sleep");
    }

}
