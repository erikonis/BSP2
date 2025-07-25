package exercise5;

public class Item {
    private double price;
    private String category;

    public ItemWithCategory(double price, String category) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}