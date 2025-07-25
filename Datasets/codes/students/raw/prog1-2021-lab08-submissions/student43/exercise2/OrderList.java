package lu.uni.programming1.lab8.exercise2;

import java.util.HashSet;

public class OrderList {
    private String store;
    private HashSet<Order> orderSet;

    public OrderList(String store) {
        this.store = store;
        this.orderSet = new HashSet<>(1);
    }

    public void addItem(Order newOrder) {
        orderSet.add(newOrder);
     }

    public double getTotal() {
        double total = 0;
        for(Order order : orderSet){
            total += order.total();
        }
        return total;
    }

    public String getStore() {
        return store;
    }

    public void order() {
        System.out.println("Order List for " + getStore() + ". Your ordered " + orderSet.size() + " different products. Total cost is: " + getTotal() + " EURO");
        int items = 1;
        for(Order order : orderSet) {
            System.out.println("\t" + items + ". Order : " + order.toString() );
            items++;
        }
    }
}
