package com.example.demo;
import com.example.demo.models.Meal;
import com.example.demo.repositories.MealRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;

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
                  "/pictures/1.png"));

          repository.save(new Meal(
            "Perfect scrambled eggs",
                  20,
                  250,
                  "https://www.bbcgoodfood.com/recipes/perfect-scrambled-eggs-recipe",
                  "/pictures/2.png"
          ));

          repository.save(new Meal(
             "Scandi smoked salmon",
             10,
             130,
             "https://www.bbcgoodfood.com/recipes/scandi-smoked-salmon",
                  "/pictures/3.png"
          ));
          repository.save(new Meal(
             "Breakfast muffins",
             45,
             179,
             "https://www.bbcgoodfood.com/recipes/breakfast-muffins",
                  "/pictures/4.png"
          ));
          repository.save(new Meal(
             "Super berry smoothie",
             10,
             120,
             "https://www.bbcgoodfood.com/recipes/super-berry-smoothie",
                  "/pictures/5.png"
          ));
          repository.save(new Meal(
             "Chocolate & almond croissants",
             10,
                  380,
                  "https://www.bbcgoodfood.com/recipes/chocolate-almond-croissants",
                  "/pictures/6.png"
          ));

          //The main event
            //Starters and canapés
            //Starters
          repository.save(new Meal(
             "Soup maker tomato soup",
             35,
             85,
             "https://www.bbcgoodfood.com/recipes/soup-maker-tomato-soup",
                  "/pictures/7.png"
          ));
          repository.save(new Meal(
             "Carpaccio scallops",
                  35,
                  100,
                  "https://www.bbcgoodfood.com/recipes/carpaccio-scallops",
                  "/pictures/8.png"
          ));
          repository.save(new Meal(
             "Smoked salmon with beetroot & vodka crème fraîche",
             15,
             190,
             "https://www.bbcgoodfood.com/recipes/smoked-salmon-beetroot-vodka-creme-fraiche",
                  "/pictures/9.png"
          ));
          repository.save(new Meal(
             "Bloody mary seafood salad",
             10,
             180,
             "https://www.bbcgoodfood.com/recipes/bloody-mary-seafood-salad",
                  "/pictures/10.png"
          ));
          //Canapés
          repository.save(new Meal(
             "Chicory cups with avocado & pink grapefruit salsa",
                  20,
                  30,
                  "https://www.bbcgoodfood.com/recipes/chicory-cups-with-avocado-pink-grapefruit-salsa",
                  "/pictures/11.png"
          ));
          repository.save(new Meal(
             "Ham & peach nibbles",
                  15,
                  20,
                  "https://www.bbcgoodfood.com/recipes/ham-peach-nibbles",
                  "/pictures/12.png"
          ));
          repository.save(new Meal(
             "Figs with goat's cheese, pistachios & honey",
                  10,
                  100,
                  "https://www.bbcgoodfood.com/recipes/figs-with-goats-cheese-pistachios-honey",
                  "/pictures/13.png"
          ));
          repository.save(new Meal(
             "Smoked salmon blinis",
                  20,
                  80,
                  "https://www.bbcgoodfood.com/recipes/salmon-herb-blinis",
                  "/pictures/14.png"
          ));
          //Christmas lunch
          repository.save(new Meal(
             "Healthy roast turkey crown",
                  120,
                  350,
                  "https://www.bbcgoodfood.com/recipes/healthy-roast-turkey-crown",
                  "/pictures/15.png"
          ));
          repository.save(new Meal(
             "Mustard-roasted beef fillet",
             80,
             300,
             "https://www.bbcgoodfood.com/recipes/mustard-roasted-beef-fillet",
                  "/pictures/16.png"
          ));
          //Vegetarian centrepiece
          repository.save(new Meal(
             "Sweet potato & chestnut roast with tangy tomato sauce",
             90,
             240,
                  "https://www.bbcgoodfood.com/recipes/sweet-potato-chestnut-roast-tangy-tomato-sauce",
                  "/pictures/17.png"
          ));
          repository.save(new Meal(
                  "Vegan beetroot bourguignon",
                  110,
                  190,
                  "https://www.bbcgoodfood.com/recipes/vegan-beetroot-bourguignon",
                  "/pictures/18.png"
          ));
          repository.save(new Meal(
             "Whole roasted cauliflower",
                  60,
                  120,
                  "https://www.bbcgoodfood.com/recipes/whole-roasted-cauliflower",
                  "/pictures/19.png"
          ));
          //Gravy

          repository.save(new Meal(
             "Vegetarian gravy",
             45,
             90,
             "https://www.bbcgoodfood.com/recipes/vegetarian-gravy",
                  "/pictures/20.png"
          ));
          repository.save(new Meal(
             "Easy red wine gravy",
             10,
             40,
             "https://www.bbcgoodfood.com/recipes/easy-red-wine-gravy",
                  "/pictures/21.png"
          ));
        };
}
}
