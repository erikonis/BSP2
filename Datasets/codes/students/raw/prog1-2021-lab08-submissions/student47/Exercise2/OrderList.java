package lu.uni.programming1.lab8.Exercise2;

import java.util.HashSet;

public class OrderList {

    private int counter = 0;
    private String name;
    private HashSet<Order> list = new HashSet<Order>();
    private double price = 0;
    Order order = new Order();

    public HashSet<Order> getList() {
        return list;
    }

    public int getCounter() {
        return counter;
    }

    public OrderList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addItem(Order item) {

        list.add(item);
    }
    public double getPrice() {
        return price;
    }

    public void order() {
        System.out.println(
            "Order List for " + getName() + ". You ordered " + getList().size() + " different products.");        
        for (Order order : getList()) {
            counter++;
            price+=order.getTotalPrice();    
            System.out.println("\t"+getCounter() + ". " + order);
            
        }       
        System.out.println("Total cost is: "+getPrice()+" EURO"); 
    }

   

}
