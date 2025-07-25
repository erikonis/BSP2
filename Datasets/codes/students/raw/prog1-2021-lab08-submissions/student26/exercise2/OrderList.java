package exercise2;

import java.util.HashSet;

public class OrderList {
    //instance variables
    String name;
    HashSet<Order> hs;

    //constructor for initializing instance variables.
    public OrderList(String name) {
        this.name = name;
        hs = new HashSet<>();
    }

    //function for adding items into hashset
    public void addItem(Order order){
        hs.add(order);
    }
    //function for calculating and printing total costs and details of order.
    public void order(){
        double totalcost = 0;
        int c = 0;
        for (Order ord : hs){
            totalcost += ord.amount*ord.unit_prc;
        }
        System.out.println("Order list for " + name + ". You ordered " + hs.size() + " different products. Total cost is: " + totalcost + " EURO");
        for (Order ord:hs){
            c++;
            System.out.println("\t\t" + c + ". Order : " + ord.amount + " " + ord.name + " x " + ord.unit_prc + " EURO = " + ord.amount*ord.unit_prc);
        }
    }
}
