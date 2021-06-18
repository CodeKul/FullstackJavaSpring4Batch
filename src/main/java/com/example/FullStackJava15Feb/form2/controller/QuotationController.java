package com.example.FullStackJava15Feb.form2.controller;

import com.example.FullStackJava15Feb.form2.domain.CustomerMaster;
import com.example.FullStackJava15Feb.form2.domain.Quotation;
import com.example.FullStackJava15Feb.form2.repositroy.CustomerMasterRepo;
import com.example.FullStackJava15Feb.form2.repositroy.QuotationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuotationController {

    @Autowired
    private CustomerMasterRepo customerMasterRepo;

    @Autowired
    private QuotationRepo quotationRepo;


    @PostMapping(value = "saveCust")
    public String saveCust(@RequestBody CustomerMaster customerMaster) {
        customerMasterRepo.save(customerMaster);
        return "Saved Customer";
    }

    @PostMapping(value = "saveQuotation")
    public String saveQuotation(@RequestBody Quotation quotation) {
        quotationRepo.save(quotation);
        return "Saved Quotation";
    }

    @GetMapping(value = "getQuotation")
    public List<Quotation> getQuotation() {
        return quotationRepo.findAll();
    }
}
