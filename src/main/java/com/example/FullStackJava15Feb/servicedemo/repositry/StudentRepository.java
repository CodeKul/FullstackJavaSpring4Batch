package com.example.FullStackJava15Feb.servicedemo.repositry;

import com.example.FullStackJava15Feb.servicedemo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
