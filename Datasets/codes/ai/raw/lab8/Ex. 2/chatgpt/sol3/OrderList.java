import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private String clientName;
    private List<OrderItem> items;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        if (items.contains(item)) {
            System.out.println("Duplicate item detected: " + item);
        } else {
            items.add(item);
        }
    }

    public void printOrder() {
        System.out.println("Order for " + clientName + ":");
        for (OrderItem item : items) {
            System.out.println(item);
        }
    }
}
