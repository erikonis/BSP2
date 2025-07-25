import java.util.HashMap;
import java.util.Map;

public class OrderList {
    private String clientName;
    private Map<String, OrderItem> items;

    public OrderList(String clientName) {
        this.clientName = clientName;
        this.items = new HashMap<>();
    }

    public void addItem(OrderItem item) {
        if (items.containsKey(item.getProductName())) {
            System.out.println("Duplicate item detected: " + item);
        } else {
            items.put(item.getProductName(), item);
        }
    }

    public void printOrder() {
        System.out.println("Order for " + clientName + ":");
        for (OrderItem item : items.values()) {
            System.out.println(item);
        }
    }
}
