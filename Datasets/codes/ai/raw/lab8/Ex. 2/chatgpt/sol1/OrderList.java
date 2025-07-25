import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private String clientName;
    private Set<OrderItem> items;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.items = new HashSet<>();
    }

    public void addItem(OrderItem item) {
        if (!items.add(item)) {
            System.out.println("Duplicate item detected: " + item);
        }
    }

    public void printOrder() {
        System.out.println("Order for " + clientName + ":");
        for (OrderItem item : items) {
            System.out.println(item);
        }
    }
}
