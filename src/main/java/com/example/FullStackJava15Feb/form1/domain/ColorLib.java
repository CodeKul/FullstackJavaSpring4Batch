package com.example.FullStackJava15Feb.form1.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "colorlib")
@Getter
@Setter
public class ColorLib {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String company;

    private Integer phoneNumber;

    private String mealPreference;

    private String paymentMode;

    private Integer ddCheckNumber;

    private String bankName;

    private String payableAt;

    private String donateUs;

}
