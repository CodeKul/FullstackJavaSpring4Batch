package com.example.FullStackJava15Feb.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {


    //Inversion of Control -> Instead of we creating object(using new Keyword) Spring will create object for you
    //@Bean -> In spring, Java object called spring bean or bean
//    @Configuration -> Indicates that a class declares one or more @Bean methods
    public static void main(String[] args) {
//        Vodafone vodafone = new Vodafone();
//        vodafone.calling();
//        vodafone.data();
//
//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();
//
//        Sim sim = new Airtel();
//        sim.calling();
//        sim.data();

        ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);

        Airtel air = context.getBean(Airtel.class);
        Vodafone vodafone = context.getBean(Vodafone.class);

        air.data();
        air.calling();
    }
}
