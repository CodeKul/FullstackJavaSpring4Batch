package com.example.FullStackJava15Feb.onetoone.controller;


import com.example.FullStackJava15Feb.onetoone.domain.Address;
import com.example.FullStackJava15Feb.onetoone.domain.Users;
import com.example.FullStackJava15Feb.onetoone.repository.AddressRepo;
import com.example.FullStackJava15Feb.onetoone.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private UserRepo userRepo;


    @GetMapping(value = "saveUser")
    public String saveUser() {
        Users users = new Users();
        users.setName("Sachin");
        users.setEmail("sachin@gmail.com");

        Address address = new Address();
        address.setStreet("aa11");
        address.setDistrict("Sangli");
        address.setState("Maha");

        users.setAddress(address);
        address.setUsers(users);
        userRepo.save(users);
        addressRepo.save(address);

        return "Record Saved";
    }

    @GetMapping(value = "getUsers")
    public ResponseEntity<?> getUsers(){
       List<Users> list =userRepo.findAll();
       return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
