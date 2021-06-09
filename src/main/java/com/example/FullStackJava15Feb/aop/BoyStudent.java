package com.example.FullStackJava15Feb.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    //    public int  studyBoys(int a,int b){
//        System.out.println("Boys Study...");
//        return 300;
//    }
    public void studyBoys(int a, int b) {
        throw new ArithmeticException("Arithmetic ex threw");
    }

    public void studyA(int b) {
        System.out.println("Boys A Study");
    }





}
