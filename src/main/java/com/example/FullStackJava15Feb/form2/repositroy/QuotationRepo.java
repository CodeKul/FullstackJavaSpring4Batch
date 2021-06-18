package com.example.FullStackJava15Feb.form2.repositroy;

import com.example.FullStackJava15Feb.form2.domain.Quotation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotationRepo extends JpaRepository<Quotation,Long> {
}
