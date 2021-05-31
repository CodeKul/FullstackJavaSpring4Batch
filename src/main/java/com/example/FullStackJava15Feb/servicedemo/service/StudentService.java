package com.example.FullStackJava15Feb.servicedemo.service;

import com.example.FullStackJava15Feb.servicedemo.domain.Student;

import java.util.List;

public interface StudentService {

    String saveStudent(Student student);

    List<Student> getStudent();

}
