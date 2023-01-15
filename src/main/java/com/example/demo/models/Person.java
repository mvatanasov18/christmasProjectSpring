package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private Integer height;
    @Column(nullable = false)
    private Integer kg;
    @Column(nullable = false)
    @JsonProperty("AMRConstant")
    private Double AMRConstant;
    @Column(nullable = false)
    private Boolean isMale;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "persons_meals",
            joinColumns = {
                    @JoinColumn(name = "person_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    @ToString.Exclude
    private Set<Meal> meals = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Person person = (Person) o;
        return id != null && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Person setKg(Integer kg) {
        this.kg = kg;
        return this;
    }

    public Person setAMRConstant(Double AMRConstant) {
        this.AMRConstant = AMRConstant;
        return this;
    }

    public Person setMale(Boolean male) {
        isMale = male;
        return this;
    }

    public Person setMeals(Set<Meal> meals) {
        this.meals = meals;
        return this;
    }
}
