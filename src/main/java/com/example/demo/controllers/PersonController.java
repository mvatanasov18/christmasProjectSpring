package com.example.demo.controllers;

import com.example.demo.models.Person;
import com.example.demo.repositories.MealRepository;
import com.example.demo.repositories.PersonRepository;
import com.example.demo.services.MealService;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private MealService mealService;
    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private MealRepository mealRepository;

    @PostMapping(value = "/person")
    @Transactional
    public ModelAndView postPerson(@ModelAttribute("person") Person p) {
        ModelAndView page = new ModelAndView();
        page.setViewName("evaluation");

        personService.setPerson(p);

        personService.setCalorieNeeded();

        //saving person's data
        personRepository.save(p);

        mealService.getList().forEach(System.out::println);

        mealRepository.saveAll(mealService.getList());

        p.getMeals().addAll(mealService.getList());
        personRepository.save(p);

        page.addObject("personService", personService);
        page.addObject("mealService", mealService);

        return page;
    }
}
