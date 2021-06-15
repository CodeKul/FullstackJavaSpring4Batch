package com.example.FullStackJava15Feb;

import com.example.FullStackJava15Feb.aop.BoyStudent;
import com.example.FullStackJava15Feb.aop.GirlStudent;
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


//        Human human = context.getBean(Human.class);
//        human.wakeUp();
        BoyStudent boyStudent = context.getBean(BoyStudent.class);
        //joint point
//        boyStudent.studyBoys(2,567);
        //joint point
//        boyStudent.studyA(3);
//
////        human.wakeUp();
//        GirlStudent girlStudy = context.getBean(GirlStudent.class);
//        girlStudy.study();

    }

}
