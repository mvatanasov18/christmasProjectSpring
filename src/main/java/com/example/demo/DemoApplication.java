package com.example.demo;
import com.example.demo.models.Meal;
import com.example.demo.repositories.MealRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {
private static final Logger log=
         LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        System.out.println("http://localhost:8080/");
    }
@Bean
    public CommandLineRunner demo(MealRepository repository){
        return args -> {
          repository.save(new Meal(
                  "Crunchy granola with berries & cherries",
                  20,
                  409,
                  "https://www.bbcgoodfood.com/recipes/crunchy-granola-berries-cherries",
                  List.of("musli mai", "oshte neshto"),
                  "https://images.immediate.co.uk/production/" +
                          "volatile/sites/30/2020/08/recipe-image-" +
                          "legacy-id-484452_11-552ad0f.jpg?quality" +
                          "=90&webp=true&resize=300,272"));

          repository.save(new Meal(
            "Perfect scrambled eggs",
                  20,
                  250,
                  "https://www.bbcgoodfood.com/recipes/perfect-scrambled-eggs-recipe",
                  List.of("qica","maslo","nesho"),
                  "https://images.immediate.co.uk/production/" +
                          "volatile/sites/30/2020/08/recipe-image-legacy" +
                          "-id-1201452_12-7f7a0fa.jpg?quality=90&webp=true&resize=375,341"
          ));
        };
}
}
