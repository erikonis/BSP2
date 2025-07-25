import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private String clientName;
    private Set<Order> orderItems;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.orderItems = new HashSet<>();
    }

    public String getClientName() {
        return clientName;
    }

    public void addItem(Order order) {
        orderItems.add(order); // HashSet automatically handles duplicates
    }

    public void order() {
        System.out.println("Order List for " + clientName + ". You ordered " + orderItems.size() + " different products. Total cost is: " + calculateTotalCost() + " EURO");
        int i = 1;
        for (Order order : orderItems) {
            System.out.println(i + ". " + order);
            i++;
        }
    }

    private double calculateTotalCost() {
        double totalCost = 0;
        for (Order order : orderItems) {
            totalCost += order.getTotalPrice();
        }
        return totalCost;
    }
}