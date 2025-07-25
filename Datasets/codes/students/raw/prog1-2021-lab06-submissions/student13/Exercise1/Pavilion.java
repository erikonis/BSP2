package src.lu.uni.programming1.lab6.Exercise1;

public class Pavilion {
    private String name;
    private double price;

    public Pavilion(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;

    }

    public String toString() {
        return name;
    }
}