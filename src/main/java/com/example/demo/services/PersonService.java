package com.example.demo.services;

import com.example.demo.models.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private Person person;
    private Double calorieNeeded;
    public int calculateCalorieIntake() {
        if (person.getIsMale()) {

            return (int) ((13.397 * person.getKg()) + (4.799 * person.getHeight()) - (5.677 * person.getAge()) + 88.362);
        } else {

            return (int) ((9.247 * person.getKg()) + (3.098 * person.getHeight()) - (4.330 * person.getAge()) + 447.593);
        }
    }
    public Person getPerson() {
        return person;
    }

    public Double getCalorieNeeded() {
        return calorieNeeded;
    }

    public void setCalorieNeeded() {
        this.calorieNeeded = this.calculateCalorieIntake()*this.person.getAMRConstant();
        this.calorieNeeded= (double) Math.round(this.calorieNeeded);
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
