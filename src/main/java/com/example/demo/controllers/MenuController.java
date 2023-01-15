package com.example.demo.controllers;

import com.example.demo.models.FormData;
import com.example.demo.models.Person;
import com.example.demo.repositories.MealRepository;
import com.example.demo.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RequestMapping(value = "/menus")
@Controller
public class MenuController {

    private final MealRepository repository;
    private final MealService service;

    @Autowired
    public MenuController(MealRepository repository, MealService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping()
    public String getMenus(Model model) {
        model.addAttribute("meals", repository.findAll());
        model.addAttribute("formData", new FormData());
        return "menus";
    }

    @PostMapping()
    public String postMenus(@ModelAttribute("formData") FormData list, Model model) {
        if (list.isEmpty()) {
            model.addAttribute("meals", repository.findAll());
            model.addAttribute("formData", new FormData());
            return "menus";
        } else {

            model.addAttribute("person", new Person());
            service.setFormData(list);
            service.setList(new ArrayList<>());
            service.toMeals();
            return "person";
        }

    }
}
