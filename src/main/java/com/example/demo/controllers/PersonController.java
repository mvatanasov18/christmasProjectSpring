package com.example.demo.controllers;

import com.example.demo.models.Person;
import com.example.demo.repositories.MealRepository;
import com.example.demo.repositories.PersonRepository;
import com.example.demo.services.MealService;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    private final MealService mealService;
    private final PersonService personService;
    private final PersonRepository personRepository;
    private final MealRepository mealRepository;


    @Autowired
    public PersonController(PersonService personService,MealService mealService,PersonRepository personRepository,MealRepository mealRepository) {
        this.personService = personService;
        this.mealService = mealService;
        this.personRepository = personRepository;
        this.mealRepository = mealRepository;
    }

    @PostMapping(value = "/person")
    @Transactional
    public String postPerson(@ModelAttribute("person") Person p, Model model) {

        personService.setPerson(p);

        personService.setCalorieNeeded();

        //saving person's data
        personRepository.save(p);

        mealService.getList().forEach(System.out::println);

        mealRepository.saveAll(mealService.getList());

        p.getMeals().addAll(mealService.getList());
        personRepository.save(p);

        model.addAttribute("personService", personService);
        model.addAttribute("mealService", mealService);

        return "evaluation";
    }
}
