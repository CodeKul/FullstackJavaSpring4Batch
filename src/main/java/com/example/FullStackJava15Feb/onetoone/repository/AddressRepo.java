package com.example.FullStackJava15Feb.onetoone.repository;

import com.example.FullStackJava15Feb.onetoone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
