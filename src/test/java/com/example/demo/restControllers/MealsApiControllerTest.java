package com.example.demo.restControllers;
import com.example.demo.models.FormData;
import com.example.demo.models.FormDataAndPerson;
import com.example.demo.models.Meal;
import com.example.demo.models.Person;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(OrderAnnotation.class)
public class MealsApiControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    @Order(1)
    void findAll() {
        ResponseEntity<List<Meal>> entity = findAllMeals();
        assertEquals(HttpStatus.OK,entity.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON,entity.getHeaders().getContentType());
        assertEquals(54, entity.getBody().size());
    }


    @Test
    @Order(2)
    void findById() {
        Meal existing = findAllMeals().getBody().get(0);
        Integer id = existing.getId();

        Meal meal = restTemplate.getForObject("/api/meals/"+id,Meal.class);

        assertEquals(id,meal.getId());
        assertEquals(existing.getName(),meal.getName());
        assertEquals(existing.getTimeNeeded(),meal.getTimeNeeded());
        assertEquals(existing.getCalories(),meal.getCalories());
        assertEquals(existing.getRecipe(),meal.getRecipe());
        assertEquals(existing.getPhoto(),meal.getPhoto());
    }

    @Test
    @Order(3)
    void postChosenMeals() {
        Person newPerson = new Person();
        newPerson.setAge(18);
        newPerson.setHeight(180);
        newPerson.setKg(65);
        newPerson.setAMRConstant(1.2);
        newPerson.setIsMale(true);

        FormData formData=new FormData();
        formData.setMealIds(new ArrayList<>(Arrays.asList(1,2,3)));

        FormDataAndPerson formDataAndPerson=new FormDataAndPerson(formData,newPerson);

        ResponseEntity<ArrayList> response = restTemplate.postForEntity(
                "/api/meals",formDataAndPerson, ArrayList.class );
        ArrayList<String> list = response.getBody();
        System.out.println(list);
        assertEquals("789",list.get(0));
        assertEquals("2064.0",list.get(1));
        assertEquals("0",list.get(2));
        assertEquals("0",list.get(3));
    }

    private ResponseEntity<List<Meal>> findAllMeals() {
        return restTemplate.exchange("/api/meals",
                HttpMethod.GET,
                new HttpEntity<>(null),
                new ParameterizedTypeReference<>() {});
    }
}
