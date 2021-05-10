package com.example.FullStackJava15Feb;

import com.example.FullStackJava15Feb.di.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FullStackJava15FebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FullStackJava15FebApplication.class, args);

//        com.example.FullStackJava15Feb.di.Student s = context.getBean(Student.class);

//        s.show();

//        com.example.FullStackJava15Feb.di.Student s1 = context.getBean(Student.class);

//        s1.show();
//        com.example.FullStackJava15Feb.di.Student s2 = context.getBean(Student.class);

//        s2.show();


//        Department d = context.getBean(Department.class);
//        d.display();


    }

}
