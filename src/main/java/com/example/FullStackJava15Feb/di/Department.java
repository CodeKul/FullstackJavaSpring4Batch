package com.example.FullStackJava15Feb.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Struct;

@Component
public class Department {

    int id;
    String name;
    String code;

//    @Autowired
//    Student student ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void display()
    {
        System.out.println("In display");
//        student.show();
    }
}
