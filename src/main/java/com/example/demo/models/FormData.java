package com.example.demo.models;

import lombok.*;

import java.util.List;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class FormData {
    private List<Integer> mealIds;


    public boolean isEmpty(){
        try {
            return this.mealIds.isEmpty();
        }catch (NullPointerException exception){
            return true;
        }
    }
}
