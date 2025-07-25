package lu.uni.programming1.lab8.exercise2;

import java.util.HashSet;

public class OrderList {

    private HashSet<Order> List;
    private String name;
    private double sum;

    public OrderList(String name) {
        this.name = name;
        sum = 0;
        List = new HashSet<Order>();
    }

    public void Add(Order command) {
        List.add(command);
    }

    public void Order() {
        for (Order a:List) {
            sum += a.GetTotalPrice();
        }
        System.out.println("\n" + "Order for " + name + ". Total Cost is: " + sum + " €." + "\n");
        int i = 1;

        for (Order a:List) {
            System.out.println(i + " Order: " + a.GetAmount() + " " + a.GetItem() + " x " + a.GetPrice() + " € = " + a.GetTotalPrice() + " €");
            i++;

        }
        System.out.println("\n");
    }
    
}
