package com.example.demo.models;

import jakarta.persistence.Entity;

public class Person {
    private Integer age;
    private Integer height;
    private Integer kg;
    private Double AMRConstant;
    private Boolean isMale;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    public Double getAMRConstant() {
        return AMRConstant;
    }

    public void setAMRConstant(Double AMRConstant) {
        this.AMRConstant = AMRConstant;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }
}
