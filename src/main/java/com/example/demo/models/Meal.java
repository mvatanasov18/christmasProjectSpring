package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "meals")
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
    @Column(nullable = false)
    private String recipe;
    @Column(nullable = false)
private String photo;


    @ManyToMany(mappedBy = "meals", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Person> students = new HashSet<>();

    public void setTimeNeeded(Integer timeNeeded) {
        if(timeNeeded<=0) {
            this.timeNeeded=Math.abs(timeNeeded);
            return;
        }
        this.timeNeeded = timeNeeded;
    }


    public Meal(String name, Integer timeNeeded, Integer calories, String recipe, String photo) {
        this.name = name;
        setTimeNeeded(timeNeeded);
        this.calories = calories;
        this.recipe = recipe;
        this.photo=photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Meal meal = (Meal) o;
        return id != null && Objects.equals(id, meal.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
