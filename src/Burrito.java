import java.util.HashMap;
import java.util.List;

public class Burrito {
    private int id;
    private double price;
    private HashMap<String, Boolean> hasIngredients;
    private List<String> detailedIngredients;

    public Burrito(int id, double price, HashMap<String, Boolean> hasIngredients, List<String> detailedIngredients) {
        this.id = id;
        this.price = price;
        this.hasIngredients = hasIngredients;
        this.detailedIngredients = detailedIngredients;
    }

    public Burrito() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HashMap<String, Boolean> getHasIngredients() {
        return hasIngredients;
    }

    public void setHasIngredients(HashMap<String, Boolean> hasIngredients) {
        this.hasIngredients = hasIngredients;
    }

    public List<String> getDetailedIngredients() {
        return detailedIngredients;
    }

    public void setDetailedIngredients(List<String> detailedIngredients) {
        this.detailedIngredients = detailedIngredients;
    }

/*    private HashMap<String, Boolean> hasIngredients;
    private final String[] rice = new String[] {"no rice", "white rice", "brown rice"};
    private final String[] meat = new String[] {"no meat", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
    private final String[] beans = new String[] {"no beans", "pinto beans", "black beans"};
    private final String[] salsa = new String[] {"no salsa", "mild salsa", "medium salsa", "hot salsa"};
    private final String[] veggies = new String[] {"no veggies", "lettuce", "fajita veggies"};
    private final String[] cheese = new String[] {"no cheese", "cheese"};
    private final String[] guac = new String[] {"no guac", "guac"};
    private final String[] queso = new String[] {"no queso", "queso"};
    private final String[] sourCream = new String[] {"no sour cream", "sour cream"};*/
}
