public package exercise5;

public class Item {
    private double price;

    public ItemWithValidation(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
} {

}