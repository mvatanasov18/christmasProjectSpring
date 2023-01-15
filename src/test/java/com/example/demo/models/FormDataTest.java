package com.example.demo.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FormDataTest {

    @Test
    void create_new_from_data(){
        FormData formData=new FormData();
        assertNull(formData.getMealIds());
        assertNotNull(formData);
        assertTrue(formData.isEmpty());
        formData.setMealIds(new ArrayList<>(Arrays.asList(1,2,3,4)));
        assertEquals(formData.getMealIds(),new ArrayList<>(Arrays.asList(1,2,3,4)));
        assertFalse(formData.isEmpty());
    }
}
