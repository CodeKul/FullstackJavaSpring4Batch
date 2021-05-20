package com.example.FullStackJava15Feb.jsonmanagebackref.repository;

import com.example.FullStackJava15Feb.jsonmanagebackref.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
