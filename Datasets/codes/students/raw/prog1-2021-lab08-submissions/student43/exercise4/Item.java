package lu.uni.programming1.lab8.exercise4;

public class Item {
    private double price;
    private String name;

    public Item(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }
    
    public String getName() {
        return this.name;
    }

}
