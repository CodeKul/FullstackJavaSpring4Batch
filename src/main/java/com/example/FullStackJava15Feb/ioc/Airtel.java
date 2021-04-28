package com.example.FullStackJava15Feb.ioc;

public class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling from Airtel");
    }

    @Override
    public void data() {
        System.out.println("Browsing from Airtel");
    }
}
