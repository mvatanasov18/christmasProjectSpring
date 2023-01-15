package com.example.demo.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormDataAndPersonTest {
    private FormDataAndPerson fdp;

    @BeforeEach
    void setUp() {
        fdp=new FormDataAndPerson(new FormData(),new Person());
    }

    @Test
    void formData() {
        assertNotNull(fdp.formData());
        assertTrue(fdp.formData().isEmpty());

        fdp.formData().setMealIds(new ArrayList<>(Arrays.asList(1,2,3,4)));

        assertEquals(fdp.formData().getMealIds(),new ArrayList<>(Arrays.asList(1,2,3,4)));
    }

    @Test
    void person() {
        assertNotNull(fdp.person());
        fdp.person().setAge(18).setKg(65).setAMRConstant(1.2).setHeight(180).setMale(true).setMeals(new HashSet<>());

        assertEquals(fdp.person().getAge(),18);
        assertEquals(fdp.person().getKg(),65);
        assertEquals(fdp.person().getAMRConstant(),1.2);
        assertEquals(fdp.person().getHeight(),180);
        assertTrue(fdp.person().getIsMale());
        assertNotNull(fdp.person().getMeals());
        fdp.person().getMeals().addAll(new ArrayList<>(List.of(
                new Meal(
                        "Crunchy granola with berries & cherries",
                        20,
                        409,
                        "https://www.bbcgoodfood.com/recipes/crunchy-granola-berries-cherries",
                        "/pictures/1.png"
                ),new Meal(
                        "Perfect scrambled eggs",
                        20,
                        250,
                        "https://www.bbcgoodfood.com/recipes/perfect-scrambled-eggs-recipe",
                        "/pictures/2.png"
                )
        )));

        assertFalse(fdp.person().getMeals().contains(new Meal(
                "Scandi smoked salmon",
                10,
                130,
                "https://www.bbcgoodfood.com/recipes/scandi-smoked-salmon",
                "/pictures/3.png"
        )));
    }
}