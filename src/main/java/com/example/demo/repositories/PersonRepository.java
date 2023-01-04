package com.example.demo.repositories;

import com.example.demo.models.Meal;
import com.example.demo.models.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer> {
    Person findMealById(Integer id);
    List<Person> findAll();
}
