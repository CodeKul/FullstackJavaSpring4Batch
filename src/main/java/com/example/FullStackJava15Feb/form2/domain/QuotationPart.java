package com.example.FullStackJava15Feb.form2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class QuotationPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String item;

    private Integer quantity;

    private Integer price;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "quotation_id")
    private Quotation quotation;

}
