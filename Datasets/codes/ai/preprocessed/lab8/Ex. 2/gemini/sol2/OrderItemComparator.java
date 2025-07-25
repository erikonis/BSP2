import java.util.Comparator;

public class OrderItemComparator implements Comparator<OrderItem> {

    @Override
    public int compare(OrderItem o1, OrderItem o2) {
        if (!o1.getProductName().equals(o2.getProductName())) {
            return o1.getProductName().compareTo(o2.getProductName());
        }
        if (o1.getUnitPrice() != o2.getUnitPrice()) {
            return Double.compare(o1.getUnitPrice(), o2.getUnitPrice());
        }
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}