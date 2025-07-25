package model;

import java.util.HashMap;
import java.util.Map;

public class OrderList {
    private final String clientName;
    private final Map<OrderItem, Order> orders;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.orders = new HashMap<>();
    }

    public void addItem(String productName, double unitPrice, int quantity) {
        OrderItem item = new OrderItem(productName, unitPrice);
        orders.merge(item, new Order(item, quantity), 
               (existing, newOrder) -> {
                   existing.addQuantity(newOrder.getQuantity());
                   return existing;
               });
    }

    public void printOrderSummary() {
        double total = orders.values().stream()
                           .mapToDouble(Order::getTotalPrice)
                           .sum();

        System.out.printf("Order List for %s (%d unique items, Total: €%.2f)%n",
                clientName, orders.size(), total);

        int counter = 1;
        for (Order order : orders.values()) {
            System.out.printf("%d. %s%n", counter++, order);
        }
    }
}