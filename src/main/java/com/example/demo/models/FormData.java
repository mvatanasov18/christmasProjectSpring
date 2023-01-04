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
        return this.mealIds.isEmpty();
    }
}
