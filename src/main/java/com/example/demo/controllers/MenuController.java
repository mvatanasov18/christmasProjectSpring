package com.example.demo.controllers;

import com.example.demo.models.FormData;
import com.example.demo.models.Meal;
import com.example.demo.models.Person;
import com.example.demo.repositories.MealRepository;
import com.example.demo.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RequestMapping(value = "/menus")
@RestController
public class MenuController {
    @Autowired
    private MealRepository repository;
    @Autowired
    private MealService service;

    @GetMapping()
    public ModelAndView getMenus(){
        ModelAndView page = new ModelAndView();
        page.setViewName("menus");
        page.addObject("meals",repository.findAll());
        page.addObject("formData", new FormData());
        return page;
    }
    @PostMapping()
    public ModelAndView postMenus(@ModelAttribute("formData") FormData list) {
        ModelAndView page = new ModelAndView();
        if(list.isEmpty()) {
            page.setViewName("menus");
            page.addObject("meals",repository.findAll());
            page.addObject("formData", new FormData());

        }else{

            page.setViewName("person");
            page.addObject("person",new Person());
            service.setFormData(list);
            service.setList(new ArrayList<>());
            service.toMeals();
        }
        return page;
    }
}
