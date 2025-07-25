import java.util.HashSet;
import java.util.Set;

public class Order {
    private String clientStore;
    private Set<OrderItem> orderItems;

    public Order(String clientStore) {
        this.clientStore = clientStore;
        this.orderItems = new HashSet<>();
    }

    public String getClientStore() {
        return clientStore;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    // Method to add an item to the order
    public boolean addItem(OrderItem item) {
        return orderItems.add(item);  // HashSet handles duplicate detection automatically
    }

    public void printOrderDetails() {
        System.out.println("Order for: " + clientStore);
        System.out.println("Items ordered:");
        for (OrderItem item : orderItems) {
            System.out.println(item);
        }
    }
}
