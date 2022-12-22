package com.example.demo.controllers;

import com.example.demo.models.Meal;
import com.example.demo.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HomeController {
@Autowired
private MealRepository repository;

    @GetMapping(value = {"/","index"})
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping(value = {"menus"})
    public ModelAndView getMenus(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menus");
        modelAndView.addObject("meals",repository.findAll());
        return modelAndView;
    }
    @ModelAttribute("meals")
    public List<Meal> getMeals(){
        return repository.findAll();
    }
}
