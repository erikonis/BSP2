import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private String storeName;
    private Set<OrderItem> items;

    public OrderList(String storeName) {
        this.storeName = storeName;
        this.items = new HashSet<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void printOrder() {
        System.out.println("Order for store: " + storeName);
        for (OrderItem item : items) {
            System.out.println(item);
        }
    }
}