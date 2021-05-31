package com.example.FullStackJava15Feb.servicedemo.service;

import com.example.FullStackJava15Feb.servicedemo.domain.Student;
import com.example.FullStackJava15Feb.servicedemo.repositry.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String saveStudent(Student student) {
       studentRepository.save(student);
        return "Saved Student....";
    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
}
