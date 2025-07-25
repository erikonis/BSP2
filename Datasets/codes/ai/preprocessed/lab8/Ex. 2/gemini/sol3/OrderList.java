import java.util.HashSet;
import java.util.Set;

public class OrderList {
    private String clientStoreName;
    private Set<OrderItem> items;

    public OrderList(String clientStoreName) {
        this.clientStoreName = clientStoreName;
        this.items = new HashSet<>();
    }

    public String getClientStoreName() {
        return clientStoreName;
    }

    public void addItem(OrderItem item) {
        items.add(item); // HashSet automatically handles duplicates based on equals() and hashCode()
    }

    public void printOrder() {
        System.out.println("--- Order for: " + clientStoreName + " ---");
        if (items.isEmpty()) {
            System.out.println("No items in this order.");
        } else {
            for (OrderItem item : items) {
                System.out.println(item);
            }
        }
        System.out.println("----------------------------------");
    }
}