package com.example.FullStackJava15Feb.form2.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
public class Quotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quotationNumber;

    private Date quotationDate;

    private String hsnCode;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerMaster customerMaster;

    @OneToMany(mappedBy = "quotation",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<QuotationPart> quotationPart;



}
