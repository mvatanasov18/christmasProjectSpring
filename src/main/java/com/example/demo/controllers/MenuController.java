package com.example.demo.controllers;

import com.example.demo.models.FormData;
import com.example.demo.models.Meal;
import com.example.demo.repositories.MealRepository;
import com.example.demo.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MenuController {
    @Autowired
    private MealRepository repository;
    @Autowired
    private MealService service;

    @GetMapping(value = "/menus")
    public ModelAndView getMenus(){
        ModelAndView page = new ModelAndView();
        page.setViewName("menus");
        page.addObject("meals",repository.findAll());
        page.addObject("formData", new FormData());
        return page;
    }
    @PostMapping(value = "/menus")
    public ModelAndView postMenus(@ModelAttribute("formData") FormData list) {
        ModelAndView page = new ModelAndView();
        if(list.isEmpty()) {
            page.setViewName("menus");
            page.addObject("meals",repository.findAll());
            page.addObject("formData", new FormData());

        }else{

            page.setViewName("evaluation");

            service.setFormData(list);
            service.setList(new ArrayList<>());
            service.toMeals();
            System.out.println(service);
        }
        return page;
    }
}
