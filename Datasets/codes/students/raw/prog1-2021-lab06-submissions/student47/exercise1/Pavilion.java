package lu.uni.programming1.lab6.exercise1;

public class Pavilion{

    private String name;
    private double price = 30;

    public Pavilion(String name){
        this.name = name;
       
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}