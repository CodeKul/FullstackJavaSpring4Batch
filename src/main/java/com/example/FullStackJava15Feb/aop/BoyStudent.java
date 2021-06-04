package com.example.FullStackJava15Feb.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    public void studyBoys(int a){
        System.out.println("Boys Study...");
    }

    public void studyA(int b){
        System.out.println("Boys A Study");
    }

}
