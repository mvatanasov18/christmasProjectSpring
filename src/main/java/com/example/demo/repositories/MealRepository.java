package com.example.demo.repositories;

import com.example.demo.models.Meal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MealRepository extends CrudRepository<Meal,Integer> {
    Meal findMealById(Integer id);
    List<Meal> findAll();
}
