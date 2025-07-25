import java.util.Set;
import java.util.TreeSet;

public class OrderList {
    private String clientName;
    private Set<OrderItem> items;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.items = new TreeSet<>();
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