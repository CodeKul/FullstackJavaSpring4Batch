package com.example.FullStackJava15Feb.servicedemo.controller;

import com.example.FullStackJava15Feb.servicedemo.domain.Student;
import com.example.FullStackJava15Feb.servicedemo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private final static Logger logger = LoggerFactory.getLogger(StudentController.class);

    @PostMapping(value = "saveStudent")
    public String saveStud(@RequestBody Student student){
        logger.info(student.getName());
        logger.warn(student.getName());
        logger.error(student.getName());
        logger.debug(student.getName());
        return studentService.saveStudent(student);
    }

    @GetMapping(value = "getStudent")
    public List<Student> getStud(){
        return studentService.getStudent();
    }
}
