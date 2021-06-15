package com.example.FullStackJava15Feb.form1.repository;

import com.example.FullStackJava15Feb.form1.domain.MealPref;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealPrefRepo extends JpaRepository<MealPref,Integer> {
}
