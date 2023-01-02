package com.example.demo.services;

import com.example.demo.models.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private Person person;
    private Double BMI;

    public void changeAMR(Integer option){
        if (option == 1) {
            person.setAMRConstant(1.2);
        } else if (option == 2) {
            person.setAMRConstant(1.375);
        } else if (option == 3) {
            person.setAMRConstant(1.55);
        } else if (option == 4) {
            person.setAMRConstant(1.725);
        } else if (option == 5) {
            person.setAMRConstant(1.9);
        }else{
            System.out.println("cannot change AMR");
        }
    }


    public int calculateCalorieIntake() {
        if (person.getMale()) {

            return (int) ((13.397 * person.getKg()) + (4.799 * person.getHeight()) - (5.677 * person.getAge()) + 88.362);
        } else {

            return (int) ((9.247 * person.getKg()) + (3.098 * person.getHeight()) - (4.330 * person.getAge()) + 447.593);
        }
    }

    private void calculateBMI(){
        this.BMI= (person.getKg() / (Math.pow((float) person.getHeight()/100,2) ));
    }
}
