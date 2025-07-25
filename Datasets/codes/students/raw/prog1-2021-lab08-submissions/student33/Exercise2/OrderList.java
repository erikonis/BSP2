package Exercise2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OrderList {
    private String name;
    private Set<Order> orders;
    
    public OrderList(String orderName) {
        this.setName(orderName);
        this.orders = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(Order order) {
        this.orders.add(order);
    }

    public void order() {
        Double totalCost = 0.0;
        for (Order order : orders) {
            totalCost += order.getTotalCost();
        }

        System.out.println("Order List for " + name + " . You ordered " + orders.size()
                + " different products. Total cost is: " + totalCost + " EURO");
        int count = 1;
        for (Order order : orders) {
            System.out.println("        " + count + ". " + order.toString());
            count ++;
        }
    }

}
