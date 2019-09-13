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
    private static final HashMap<String, String[]> ingredientDetails = new HashMap<String, String[]>();

    public static void main(String[] args) {

        List<Burrito> burritos = new ArrayList<>();

        ingredientDetails.put("rice", new String[] {"no rice", "white rice", "brown rice"});
        ingredientDetails.put("meat", new String[] {"no meat", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"});
        ingredientDetails.put("beans", new String[] {"no beans", "pinto beans", "black beans"});
        ingredientDetails.put("salsa", new String[] {"no salsa", "mild salsa", "medium salsa", "hot salsa"});
        ingredientDetails.put("veggies", new String[] {"no veggies", "lettuce", "fajita veggies"});
        ingredientDetails.put("cheese", new String[] {"no cheese", "cheese"});
        ingredientDetails.put("guac", new String[] {"no guac", "guac"});
        ingredientDetails.put("queso", new String[] {"no queso", "queso"});
        ingredientDetails.put("sourCream", new String[] {"no sour cream", "sour cream"});

        System.out.println("\n***Burritos Generator***\n");
        //generates 25 random Burritos
        for (int i = 0; i < 25; i++){
            burritos.add(getRandomBurrito());
            System.out.printf("\nBurrito #%d: %s Price: $%.2f", i+1, burritos.get(i).getDetailedIngredients(), burritos.get(i).getPrice());
        }
    }

    //return a random Burrito with 5 to 9 ingredients
    private static Burrito getRandomBurrito() {
        Burrito randomBurrito = new Burrito();
        List<String> randomIngredients = new ArrayList<String>();
        //get a random number of ingredients (5 to 9)
        int numberIngredients = new Random().nextInt(5) + 5;
        int chargeableIngredients = numberIngredients;

        //randomly stores the ingredient's details for all 9 ingredients
        for (String ingredient : availableIngredients) {
            String[] details = ingredientDetails.get(ingredient);
            randomIngredients.add(details[new Random().nextInt(details.length)]);
        }

        //shuffle ingredients list and randomly pick 5 to 9 of them
        Collections.shuffle(randomIngredients);
        for (int i = 0; i < (9 - numberIngredients); i++)
            randomIngredients.remove(i);

        //get number of chargeble ingredients
        for (String ingredient : randomIngredients) {
            if (ingredient.substring(0,3).equals("no "))
                chargeableIngredients--;
        }

        randomBurrito.setDetailedIngredients(randomIngredients);
        randomBurrito.setPrice(chargeableIngredients);

        return randomBurrito;
    }
}
