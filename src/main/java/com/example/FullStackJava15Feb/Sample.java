package com.example.FullStackJava15Feb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Sample {

    @Autowired

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hii Spring boot";
    }


//    @PostMapping(value = "saveStudent")
//    public String saveStudent(@RequestBody Student student){
////        save()
//    }

}
