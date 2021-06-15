package com.example.FullStackJava15Feb.form1.controller;

import com.example.FullStackJava15Feb.form1.domain.ColorLib;
import com.example.FullStackJava15Feb.form1.domain.MealPref;
import com.example.FullStackJava15Feb.form1.repository.ColorLibRepo;
import com.example.FullStackJava15Feb.form1.repository.MealPrefRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/colorLib")
public class ColorLibController {


    @Autowired
    private ColorLibRepo colorLibRepo;

    @Autowired
    private MealPrefRepo mealPrefRepo;

    @PostMapping(value = "save")
    public String saveColorLib(@RequestBody ColorLib colorLib) {
        colorLibRepo.save(colorLib);
        return "ColorLib Saved";
    }

    @PostMapping(value = "saveMealPref")
    public String saveMealPref(@RequestBody MealPref mealPref) {
        mealPrefRepo.save(mealPref);
        return "ColorLib Saved";
    }

    @GetMapping(value = "getMealPref")
    public List<MealPref> getMealPref() {
        return mealPrefRepo.findAll();
    }

}
