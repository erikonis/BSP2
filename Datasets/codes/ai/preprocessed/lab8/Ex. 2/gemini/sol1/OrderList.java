import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private String storeName;
    private Set<OrderItem> orderItems;

    public OrderList(String storeName) {
        this.storeName = storeName;
        this.orderItems = new HashSet<>();
    }

    public void addItem(OrderItem item) {
        orderItems.add(item); // HashSet handles duplicates
    }

    public void printOrder() {
        System.out.println("Order for store: " + storeName);
        for (OrderItem item : orderItems) {
            System.out.println(item);
        }
    }
}