import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private String clientName;
    private Set<Order> orders;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.orders = new HashSet<>();
    }

    public void addItem(Order order) {
        orders.add(order);
    }

    public void printOrderList() {
        double totalCost = orders.stream().mapToDouble(Order::getTotalPrice).sum();
        System.out.println("Order List for " + clientName + ". You ordered " + orders.size() + " different products. Total cost is: " + totalCost + " EURO");
        int index = 1;
        for (Order order : orders) {
            System.out.println(index + ". Order: " + order);
            index++;
        }
    }
}