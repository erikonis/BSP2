package lu.uni.programming1.lab8.exercise1;

public class item {

    private double price;
    private String itemName;

    public item(String itemName, double price) {
        this.price = price; // The price isn't necessary in this exercise, I just thought it would make sense
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
