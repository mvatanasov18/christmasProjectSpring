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
      //loading data
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
          repository.save(new Meal(
                  "Cranberry sauce with gin & rosemary",
                  25,
                  65,
                  "https://www.bbcgoodfood.com/recipes/cranberry-sauce-with-gin-rosemary",
                  "/pictures/22.png"
          ));

          repository.save(new Meal(
                  "Red cabbage with apples",
                  50,
                  70,
                  "https://www.bbcgoodfood.com/recipes/red-cabbage-apples",
                  "/pictures/23.png"
          ));
          repository.save(new Meal(
                  "Wilted spinach with nutmeg & garlic",
                  10,
                  70,
                  "https://www.bbcgoodfood.com/recipes/wilted-spinach-nutmeg-garlic",
                  "/pictures/24.png"
          ));
          repository.save(new Meal(
                  "Brown butter carrots & sprout petals",
                  40,
                  73,
                  "https://www.bbcgoodfood.com/recipes/brown-butter-carrots-sprout-petals",
                  "/pictures/25.png"
          ));
          repository.save(new Meal(
                  "Chipolatas wrapped in sage & pancetta",
                  30,
                  103,
                  "https://www.bbcgoodfood.com/recipes/chipolatas-wrapped-sage-pancetta",
                  "/pictures/26.png"
          ));
          repository.save(new Meal(
                  "Cherry & pistachio stuffing",
                  35,
                  130,
                  "https://www.bbcgoodfood.com/recipes/cherry-pistachio-stuffing",
                  "/pictures/27.png"
          ));
          repository.save(new Meal(
                  "Smoky bay bread sauce",
                  35,
                  137,
                  "https://www.bbcgoodfood.com/recipes/smoky-bay-bread-sauce",
                  "/pictures/28.png"
          ));
          repository.save(new Meal(
                  "Hasselback parsnips with orange & maple syrup",
                  45,
                  137,
                  "https://www.bbcgoodfood.com/recipes/hasselback-parsnips-with-orange-maple-syrup",
                  "/pictures/29.png"
          ));
          repository.save(new Meal(
                  "Chilli-charred Brussels sprouts",
                  30,
                  140,
                  "https://www.bbcgoodfood.com/recipes/chilli-charred-brussels-sprouts",
                  "/pictures/30.png"
          ));
          repository.save(new Meal(
                  "Crisp honey mustard parsnips",
                  20,
                  150,
                  "https://www.bbcgoodfood.com/recipes/crisp-honey-mustard-parsnips",
                  "/pictures/31.png"
          ));
          repository.save(new Meal(
                  "Lighter creamed spinach",
                  15,
                  150,
                  "https://www.bbcgoodfood.com/recipes/easy-creamed-spinach-0",
                  "/pictures/32.png"
          ));
          repository.save(new Meal(
                  "Sticky mulled cider carrots",
                  65,
                  153,
                  "https://www.bbcgoodfood.com/recipes/sticky-mulled-cider-carrots",
                  "/pictures/33.png"
          ));
          repository.save(new Meal(
                  "Giant pig-in-a-blanket pinwheel",
                  25,
                  226,
                  "https://www.bbcgoodfood.com/recipes/giant-pig-in-a-blanket-pinwheel",
                  "/pictures/34.png"
          ));
          repository.save(new Meal(
                  "Herby roast potatoes",
                  75,
                  233,
                  "https://www.bbcgoodfood.com/recipes/herby-roast-potatoes",
                  "/pictures/35.png"
          ));
          repository.save(new Meal(
                  "Gingerbread mince pies",
                  45,
                  300,
                  "https://www.bbcgoodfood.com/recipes/gingerbread-mince-pies",
                  "/pictures/36.png"
          ));
          repository.save(new Meal(
                  "Christmas crinkle cookies",
                  30,
                  88,
                  "https://www.bbcgoodfood.com/recipes/christmas-crinkle-cookies",
                  "/pictures/37.png"
          ));
          repository.save(new Meal(
                  "Christmas truffles",
                  420,
                  80,
                  "https://www.bbcgoodfood.com/recipes/christmas-truffles",
                  "/pictures/38.png"
          ));
          repository.save(new Meal(
                  "Chocolate & berry mousse pots",
                  20,
                  160,
                  "https://www.bbcgoodfood.com/recipes/chocolate-berry-mousse-pots",
                  "/pictures/39.png"
          ));
          repository.save(new Meal(
                  "Stollen bites",
                  300,
                  164,
                  "https://www.bbcgoodfood.com/recipes/stollen-bites",
                  "/pictures/40.png"
          ));
          repository.save(new Meal(
                  "Lighter Christmas pudding",
                  330,
                  270,
                  "https://www.bbcgoodfood.com/recipes/lighter-christmas-pudding",
                  "/pictures/41.png"
          ));
          repository.save(new Meal(
                  "Clementine custard tarts",
                  45,
                  187,
                  "https://www.bbcgoodfood.com/recipes/clementine-custard-tarts",
                  "/pictures/42.png"
          ));
          repository.save(new Meal(
                  "Cranberry sangria",
                  65,
                  151,
                  "https://www.bbcgoodfood.com/recipes/cranberry-sangria",
                  "/pictures/43.png"
          ));
          repository.save(new Meal(
                  "Mulled beer",
                  15,
                  163,
                  "https://www.bbcgoodfood.com/recipes/mulled-beer",
                  "/pictures/44.png"
          ));
          repository.save(new Meal(
                  "Christmas punch",
                  8*60,
                  151,
                  "https://www.bbcgoodfood.com/recipes/christmas-punch",
                  "/pictures/45.png"
          ));
          repository.save(new Meal(
                  "Espresso shrub martini",
                  15,
                  135,
                  "https://www.bbcgoodfood.com/recipes/espresso-shrub-martini",
                  "/pictures/46.png"
          ));
          repository.save(new Meal(
                  "Grapefruit gin sour mocktail",
                  5,
                  76,
                  "https://www.bbcgoodfood.com/recipes/grapefruit-gin-sour-mocktail",
                  "/pictures/47.png"
          ));
          repository.save(new Meal(
                  "Winter whiskey sour",
                  10,
                  76,
                  "https://www.bbcgoodfood.com/recipes/winter-whiskey-sour",
                  "/pictures/48.png"
          ));
          repository.save(new Meal(
                  "Tiramisu truffles",
                  120,
                  132,
                  "https://www.bbcgoodfood.com/recipes/tiramisu-truffles",
                  "/pictures/49.png"
          ));
          repository.save(new Meal(
                  "Cookie dough truffles",
                  140,
                  112,
                  "https://www.bbcgoodfood.com/recipes/cookie-dough-truffles",
                  "/pictures/50.png"
          ));
          repository.save(new Meal(
                  "Reindeer & snowman chocolate bark",
                  15,
                  128,
                  "https://www.bbcgoodfood.com/recipes/reindeer-snowman-bark",
                  "/pictures/51.png"
          ));
          repository.save(new Meal(
                  "Peppermint creams",
                  25,
                  51,
                  "https://www.bbcgoodfood.com/recipes/peppermint-creams",
                  "/pictures/52.png"
          ));
          repository.save(new Meal(
                  "Spicy turkey noodles",
                  25,
                  276,
                  "https://www.bbcgoodfood.com/recipes/spicy-turkey-noodles",
                  "/pictures/53.png"
          ));
          repository.save(new Meal(
                  "Turkey & avocado toast",
                  15,
                  208,
                  "https://www.bbcgoodfood.com/recipes/turkey-avocado-toast",
                  "/pictures/54.png"
          ));
        };
}
}
