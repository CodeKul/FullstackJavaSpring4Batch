package com.example.FullStackJava15Feb.spcall.repository;

import com.example.FullStackJava15Feb.jsonmanagebackref.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface SpCallRepository extends JpaRepository<Customer,Integer> {


    @Query(value = "{call getCustomer()}",nativeQuery = true)
    List<Map<String,String>> getCustomerData();
}
