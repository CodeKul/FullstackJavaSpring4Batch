package com.example.FullStackJava15Feb.form2.repositroy;

import com.example.FullStackJava15Feb.form2.domain.CustomerMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerMasterRepo extends JpaRepository<CustomerMaster,Long> {
}
