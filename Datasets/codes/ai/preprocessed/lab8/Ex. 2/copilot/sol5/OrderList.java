import java.util.HashSet;

public class OrderList {
    private String clientName;
    private HashSet<Order> orders;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.orders = new HashSet<>();
    }

    public void addItem(Order order) {
        orders.add(order);
    }

    public void printOrder() {
        double totalCost = 0;
        int index = 1;
        System.out.println("Order List for " + clientName + ". You ordered " + orders.size() + " different products.");
        for (Order order : orders) {
            System.out.println(index + ". Order: " + order);
            totalCost += order.getTotalPrice();
            index++;
        }
        System.out.println("Total cost is: " + totalCost + " EURO");
    }
}