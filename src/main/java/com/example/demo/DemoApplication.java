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
                  "https://images.immediate.co.uk/production/" +
                          "volatile/sites/30/2020/08/recipe-image-" +
                          "legacy-id-484452_11-552ad0f.jpg?quality" +
                          "=90&webp=true&resize=300,272"));

          repository.save(new Meal(
            "Perfect scrambled eggs",
                  20,
                  250,
                  "https://www.bbcgoodfood.com/recipes/perfect-scrambled-eggs-recipe",
                  "https://images.immediate.co.uk/production/" +
                          "volatile/sites/30/2020/08/recipe-image-legacy" +
                          "-id-1201452_12-7f7a0fa.jpg?quality=90&webp=true&resize=375,341"
          ));

          repository.save(new Meal(
             "Scandi smoked salmon",
             10,
             130,
             "https://www.bbcgoodfood.com/recipes/scandi-smoked-salmon",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/" +
                          "recipe-image-legacy-id-1155495_11-29b23c1.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Breakfast muffins",
             45,
             179,
             "https://www.bbcgoodfood.com/recipes/breakfast-muffins",
             "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/" +
                     "muffins-d49653c.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Super berry smoothie",
             10,
             120,
             "https://www.bbcgoodfood.com/recipes/super-berry-smoothie",
                  "https://images.immediate.co.uk/production/volatile/sites/" +
                          "30/2020/08/recipe-image-legacy-id-901773_11-afec2d8.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Chocolate & almond croissants",
             10,
                  380,
                  "https://www.bbcgoodfood.com/recipes/chocolate-almond-croissants",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe" +
                          "-image-legacy-id-459551_11-b93fcd9.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Soup maker tomato soup",
             35,
             85,
             "https://www.bbcgoodfood.com/recipes/soup-maker-tomato-soup",
             "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/soup" +
                     "-maker-tomato-soup-5f6ae46.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Carpaccio scallops",
                  35,
                  100,
                  "https://www.bbcgoodfood.com/recipes/carpaccio-scallops",
                  "https://images.immediate.co.uk/production/volatile/sites/30/" +
                          "2020/08/carpaccio-scallops-3f035e7.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Smoked salmon with beetroot & vodka crème fraîche",
             15,
             190,
             "https://www.bbcgoodfood.com/recipes/smoked-salmon-beetroot-vodka-creme-fraiche",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe" +
                          "-image-legacy-id-442491_11-14bc7a1.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Bloody mary seafood salad",
             10,
             180,
             "https://www.bbcgoodfood.com/recipes/bloody-mary-seafood-salad",
             "https://images.immediate.co.uk/production/volatile/sites/30/2020/09/Bloody" +
                     "-Mary-Seafood-Salad-d774a0c.jpg?quality=90&webp=true&resize=375,341"
          ));
        };
}
}
