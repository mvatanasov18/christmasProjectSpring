package com.example.demo.RestControllers;

import com.example.demo.models.Meal;
import com.example.demo.repositories.MealRepository;
import com.example.demo.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/api/menus")
@RestController
public class RestMenuController {

    private final MealRepository repository;
    private final MealService service;
    @Autowired
    public RestMenuController(MealRepository repository,MealService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping
    public List<Meal> getAllMeals(){
        return repository.findAll();
    }

}
