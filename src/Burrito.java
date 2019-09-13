import java.util.List;

public class Burrito {
    private double price;
    private List<String> detailedIngredients;

    public double getPrice() {
        return price;
    }

    public void setPrice(int chargeableIngredients) {
        double price = 3 + (chargeableIngredients * 0.50);
        this.price = price;
    }

    public List<String> getDetailedIngredients() {
        return detailedIngredients;
    }

    public void setDetailedIngredients(List<String> detailedIngredients) {
        this.detailedIngredients = detailedIngredients;
    }
}
