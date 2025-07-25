public package exercise5;

public class Item {
    private double price;
    private double discount;

    public ItemWithDiscount(double price, double discount) {
        if (price < 0 || discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Invalid price or discount.");
        }
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price - (price * discount / 100);
    }
} {
    
}
