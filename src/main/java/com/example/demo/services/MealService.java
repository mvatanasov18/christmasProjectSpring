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
    List<Meal> list;

    @Autowired
    MealRepository repository;

    public MealService() {
    }

    public MealService(FormData formData, List<Meal> list,MealRepository repository) {
        this.formData = formData;
        this.list = list;

    }

    public void toMeals(){
        formData.getMealIds().forEach(id->{
            list.add(repository.findMealById(id));
        });
    }

    @Override
    public String toString() {
        return list.stream().map(Meal::toString).collect(Collectors.joining(" "));
    }

    public FormData getFormData() {
        return formData;
    }

    public void setFormData(FormData formData) {
        this.formData = formData;
    }

    public List<Meal> getList() {
        return list;
    }

    public void setList(List<Meal> list) {
        this.list = list;
    }
}
