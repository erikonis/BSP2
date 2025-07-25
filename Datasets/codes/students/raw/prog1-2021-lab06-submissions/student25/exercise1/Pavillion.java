package lu.uni.programming1.lab6.exercise1;

public class Pavillion {

    private String  name;
    private Double price;

    Pavillion(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
    
}