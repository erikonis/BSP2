import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrderList {
    private String storeName;
    private Set<OrderItem> orderItems;

    public OrderList(String storeName, Comparator<OrderItem> comparator) {
        this.storeName = storeName;
        this.orderItems = new TreeSet<>(comparator); // Use TreeSet for sorting if needed. Or keep as HashSet.
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void printOrder() {
        System.out.println("Order for store: " + storeName);
        for (OrderItem item : orderItems) {
            System.out.println(item);
        }
    }
}