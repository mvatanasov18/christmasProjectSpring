package com.example.demo.services;

import com.example.demo.models.FormData;
import com.example.demo.models.Meal;
import com.example.demo.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MealService {
    FormData formData;
    List<Meal> listMeal;

    @Autowired
    MealRepository repository;

    public MealService() {
    }

    public MealService(FormData formData, List<Meal> listMeal,MealRepository repository) {
        this.formData = formData;
        this.listMeal = listMeal;

    }

    public void toMeals(){
        formData.getMealIds().forEach(id->{
            listMeal.add(repository.findMealById(id));
        });
    }

    public Integer sumCalories(){
        Integer sum=0;
        for(Meal meal:listMeal){
            sum+=meal.getCalories();
        }
        return sum;
    }
    
    @Override
    public String toString() {
        return listMeal.stream().map(Meal::toString).collect(Collectors.joining(" "));
    }

    public FormData getFormData() {
        return formData;
    }

    public void setFormData(FormData formData) {
        this.formData = formData;
    }

    public List<Meal> getList() {
        return listMeal;
    }

    public void setList(List<Meal> listMeal) {
        this.listMeal = listMeal;
    }
}
