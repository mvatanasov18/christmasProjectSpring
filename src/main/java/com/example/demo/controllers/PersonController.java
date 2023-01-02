package com.example.demo.controllers;

import com.example.demo.models.FormData;
import com.example.demo.models.Person;
import com.example.demo.services.MealService;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PersonController {
    @Autowired
    private MealService mealService;
    @Autowired
    private PersonService personService;
    @PostMapping(value = "/person")
    public ModelAndView postPerson(@ModelAttribute("person") Person p){
        ModelAndView page = new ModelAndView();
        page.setViewName("evaluation");
        System.out.println(mealService.sumCalories());
        return page;
    }
}
