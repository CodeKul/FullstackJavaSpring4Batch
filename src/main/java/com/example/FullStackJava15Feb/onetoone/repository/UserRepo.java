package com.example.FullStackJava15Feb.onetoone.repository;

import com.example.FullStackJava15Feb.onetoone.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
}
