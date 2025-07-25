import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private final String clientStore;
    private final Set<Order> orders;
    private double totalCost;

    public OrderList(String clientStore) {
        this.clientStore = clientStore;
        this.orders = new HashSet<>();
        this.totalCost = 0.0;
    }

    public void addItem(Order order) {
        if (orders.add(order)) {
            totalCost += order.getTotalPrice();
        }
    }

    public void printOrder() {
        System.out.printf("Order List for %s. You ordered %d different products. Total cost is: %.1f EURO%n",
                clientStore, orders.size(), totalCost);

        int index = 1;
        for (Order order : orders) {
            System.out.printf("%d. Order: %s%n", index++, order);
        }
    }
}