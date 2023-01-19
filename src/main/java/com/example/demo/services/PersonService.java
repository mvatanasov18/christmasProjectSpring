package com.example.demo.services;

import com.example.demo.models.Person;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class PersonService {

    private Person person;
    private Double calorieNeeded;
    public int calculateCalorieIntake() {
        System.out.println(person);
        if (person.getIsMale()) {

            return (int) ((13.397 * person.getKg()) + (4.799 * person.getHeight()) - (5.677 * person.getAge()) + 88.362);
        } else {

            return (int) ((9.247 * person.getKg()) + (3.098 * person.getHeight()) - (4.330 * person.getAge()) + 447.593);
        }
    }

    public void setCalorieNeeded() {
        this.calorieNeeded = this.calculateCalorieIntake()*this.person.getAMRConstant();
        this.calorieNeeded= (double) Math.round(this.calorieNeeded);
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
