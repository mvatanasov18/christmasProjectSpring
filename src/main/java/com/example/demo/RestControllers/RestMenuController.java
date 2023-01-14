package com.example.demo.RestControllers;

import com.example.demo.models.FormData;
import com.example.demo.models.FormDataAndPerson;
import com.example.demo.models.Meal;
import com.example.demo.models.Person;
import com.example.demo.repositories.MealRepository;
import com.example.demo.repositories.PersonRepository;
import com.example.demo.services.MealService;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping(value = "/api/meals")
@RestController
public class RestMenuController {

    private final MealService mealService;
    private final PersonService personService;
    private final PersonRepository personRepository;
    private final MealRepository mealRepository;
@Autowired
    public RestMenuController(PersonService personService,MealService mealService,PersonRepository personRepository,MealRepository mealRepository) {
        this.personService = personService;
        this.mealService = mealService;
        this.personRepository = personRepository;
        this.mealRepository = mealRepository;
    }

    @GetMapping
    public List<Meal> getAllMeals(){
        return mealRepository.findAll();
    }

    @GetMapping("/{id}")
    public Meal getMealById(@PathVariable String id){
        return mealRepository.findMealById(Integer.parseInt(id));
    }
    @PostMapping
    public ArrayList<String> postChosenMeals(@RequestBody FormDataAndPerson formDataAndPerson){
        System.out.println("here");
        FormData formData = formDataAndPerson.getFormData();
        Person person = formDataAndPerson.getPerson();
        mealService.setFormData(formData);
        mealService.setList(new ArrayList<>());
        mealService.toMeals();

        personService.setPerson(person);
        personService.setCalorieNeeded();

        personRepository.save(person);
        mealRepository.saveAll(mealService.getList());

        person.getMeals().addAll(mealService.getList());
        personRepository.save(person);
        return new ArrayList<>(
                Arrays.asList(
                        mealService.sumCalories().toString(),
                        personService.getCalorieNeeded().toString(),
                        mealService.sumCaloriesForDrinks().toString(),
                        mealService.sumCaloriesForDesserts().toString()));
    }


}
