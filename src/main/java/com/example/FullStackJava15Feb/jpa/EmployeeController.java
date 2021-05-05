package com.example.FullStackJava15Feb.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping(value = "saveEmployee")
    public String saveEmp(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee Saved Successfully...";
    }

    @GetMapping(value = "getEmployee")
    public List<Employee> getListEmp(){
        return employeeRepository.findAll();
    }



}
