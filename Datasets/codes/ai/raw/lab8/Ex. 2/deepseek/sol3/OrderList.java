import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private String storeName;
    private Set<OrderItemWrapper> items;

    public OrderList(String storeName) {
        this.storeName = storeName;
        this.items = new HashSet<>();
    }

    public void addItem(OrderItem item) {
        items.add(new OrderItemWrapper(item));
    }

    public void printOrder() {
        System.out.println("Order for store: " + storeName);
        for (OrderItemWrapper wrapper : items) {
            System.out.println(wrapper);
        }
    }
}