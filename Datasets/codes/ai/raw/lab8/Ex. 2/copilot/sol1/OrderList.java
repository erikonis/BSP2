import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private String clientStoreName;
    private Set<OrderItem> items;

    public OrderList(String clientStoreName) {
        this.clientStoreName = clientStoreName;
        this.items = new HashSet<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void printOrderList() {
        System.out.println("Order List for " + clientStoreName + ":");
        for (OrderItem item : items) {
            System.out.println(item);
        }
    }
}