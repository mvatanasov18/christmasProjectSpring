package com.example.demo.controllers;

import com.example.demo.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/menus")
@RestController
public class MenuController {
    @Autowired
    private MealRepository repository;

    @GetMapping()
    public ModelAndView getMenus(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menus");
        modelAndView.addObject("meals",repository.findAll());
        return modelAndView;
    }
}
