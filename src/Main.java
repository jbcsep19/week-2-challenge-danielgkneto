/*Write a program that will allow a robot to assemble 25 burritos. Use a random generator for each burrito option and build a list of 25 burrito customizations:

Rice: white, brown, none, all
Meat: chicken, steak, carnidas, chorizo, sofritas, veggies, none, all
Beans: pinto, black, none
Salsa: mild, medium, hot, none, all
Veggies: lettuce, fajita veggies, none, all
Cheese: yes/no
Guac: yes/no
Queso: yes/no
Sour cream: yes/no

Randomly generate a number of ingredients per burrito. Each burrito should have a minimum of 5 ingredients and a maximum of 9 ingredients. Save the finished burritos and display the contents.

Calculate and display a price for each burrito. Pricing will be $3.00 plus 0.50 for each additional ingredient.

If you're finished with above before 3pm, modify your program to use methods. For example, you can call a method from main whose sole purpose is to calculate the price of the burrito.*/

import java.util.*;

public class Main {


    private static final String[] availableIngredients = new String[] {"rice", "meat", "beans", "salsa", "veggies", "cheese", "guac", "queso", "sourCream"};
    private static final String[] rice = new String[] {"no rice", "white rice", "brown rice"};
    private static final String[] meat = new String[] {"no meat", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
    private static final String[] beans = new String[] {"no beans", "pinto beans", "black beans"};
    private static final String[] salsa = new String[] {"no salsa", "mild salsa", "medium salsa", "hot salsa"};
    private static final String[] veggies = new String[] {"no veggies", "lettuce", "fajita veggies"};
    private static final String[] cheese = new String[] {"no cheese", "cheese"};
    private static final String[] guac = new String[] {"no guac", "guac"};
    private static final String[] queso = new String[] {"no queso", "queso"};
    private static final String[] sourCream = new String[] {"no sour cream", "sour cream"};

    public static void main(String[] args) {


        List<Burrito> burritos = new ArrayList<>();

        for (int i = 0; i < 25; i++){
            burritos.add(getRandomBurrito());
        }
    }

    private static Burrito getRandomBurrito() {
        Burrito randomBurrito = new Burrito();
        List<String> options = new ArrayList<>();
        Collections.addAll(options, availableIngredients);
        //get a random number of ingredients (5 to 9)
        int numberIngredients = new Random().nextInt(5) + 5;
        List<Integer> randomIngredientsIndexes = new ArrayList<>();

        //choose ingredients randomly
        int counter = 0;
        while (counter < numberIngredients) {
            int randomIndex = new Random().nextInt(9);
            if (!options.contains(availableIngredients[randomIndex])){
                options.add(availableIngredients[randomIndex]);
                counter++;
            }
        }
        

    }
}
