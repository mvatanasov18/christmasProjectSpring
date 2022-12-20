package com.example.demo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
private String name;
    @Column(nullable = false)
private Integer timeNeeded;
    @Column(nullable = false)
    private Integer calories;

    private String recipe;
private String photo;
    @ElementCollection
    private List<String> ingredients;

    public Meal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimeNeeded() {
        return timeNeeded;
    }

    public void setTimeNeeded(Integer timeNeeded) {
        if(timeNeeded<=0) {
            this.timeNeeded=Math.abs(timeNeeded);
            return;
        }
        this.timeNeeded = timeNeeded;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", timeNeeded='" + timeNeeded + '\'' +
                ", calories=" + calories +
                ", recipe='" + recipe + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Meal(String name, Integer timeNeeded, Integer calories, String recipe, List<String> ingredients, String photo) {
        this.name = name;
        setTimeNeeded(timeNeeded);
        this.calories = calories;
        this.recipe = recipe;
        this.ingredients = ingredients;
        this.photo=photo;
    }
}
