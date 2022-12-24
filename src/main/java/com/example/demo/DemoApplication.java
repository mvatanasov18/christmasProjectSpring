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

          //The main event
            //Starters and canapés
            //Starters
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
          //Canapés
          repository.save(new Meal(
             "Chicory cups with avocado & pink grapefruit salsa",
                  20,
                  30,
                  "https://www.bbcgoodfood.com/recipes/chicory-cups-with-avocado-pink-grapefruit-salsa",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2021/11/Chicory-cups-with" +
                          "-avocado-and-pink-grapefruit-salsa-5757692.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Ham & peach nibbles",
                  15,
                  20,
                  "https://www.bbcgoodfood.com/recipes/ham-peach-nibbles",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/" +
                          "ham-and-peach-nibbles-bbf2810.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Figs with goat's cheese, pistachios & honey",
                  10,
                  100,
                  "https://www.bbcgoodfood.com/recipes/figs-with-goats-cheese-pistachios-honey",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2021/11/Figs-with-goats" +
                          "-cheese-pistachios-and-honey-4b3f031.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Smoked salmon blinis",
                  20,
                  80,
                  "https://www.bbcgoodfood.com/recipes/salmon-herb-blinis",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/salmon" +
                          "-herb-blinis-375751d.jpg?quality=90&webp=true&resize=375,341"
          ));
          //Christmas lunch
          repository.save(new Meal(
             "Healthy roast turkey crown",
                  120,
                  350,
                  "https://www.bbcgoodfood.com/recipes/healthy-roast-turkey-crown",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/" +
                          "turkey-c1a4d92.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Mustard-roasted beef fillet",
             80,
             300,
             "https://www.bbcgoodfood.com/recipes/mustard-roasted-beef-fillet",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/" +
                          "recipe-image-legacy-id-51107_12-bb6060d.jpg?quality=90&webp=true&resize=375,341"
          ));
          //Vegetarian centrepiece
          repository.save(new Meal(
             "Sweet potato & chestnut roast with tangy tomato sauce",
             90,
             240,
                  "https://www.bbcgoodfood.com/recipes/sweet-potato-chestnut-roast-tangy-tomato-sauce",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/" +
                          "nut-loaf-c0e0cbb.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
                  "Vegan beetroot bourguignon",
                  110,
                  190,
                  "https://www.bbcgoodfood.com/recipes/vegan-beetroot-bourguignon",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2022/02/" +
                          "beet-bourguinon-4ec6435.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Whole roasted cauliflower",
                  60,
                  120,
                  "https://www.bbcgoodfood.com/recipes/whole-roasted-cauliflower",
                  "https://images.immediate.co.uk/production/volatile/sites/30/2022/11/" +
                          "Whole-roasted-cauliflower-9bb4548.jpg?quality=90&webp=true&resize=375,341"
          ));
          //Gravy

          repository.save(new Meal(
             "Vegetarian gravy",
             45,
             90,
             "https://www.bbcgoodfood.com/recipes/vegetarian-gravy",
             "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/" +
                     "recipe-image-legacy-id-464618_11-5896eb2.jpg?quality=90&webp=true&resize=375,341"
          ));
          repository.save(new Meal(
             "Easy red wine gravy",
             10,
             40,
             "https://www.bbcgoodfood.com/recipes/easy-red-wine-gravy",
             "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/" +
                     "recipe-image-legacy-id-441555_12-333cd49.jpg?quality=90&webp=true&resize=375,341"
          ));
        };
}
}
