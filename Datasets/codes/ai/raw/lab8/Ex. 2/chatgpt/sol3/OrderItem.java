import java.util.Objects;

public class OrderItem {
    private String productName;
    private double unitPrice;
    private int quantity;

    public OrderItem(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Double.compare(orderItem.unitPrice, unitPrice) == 0 &&
                quantity == orderItem.quantity &&
                productName.equals(orderItem.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, unitPrice, quantity);
    }

    @Override
    public String toString() {
        return quantity + "x " + productName + " @ " + unitPrice + " EUR each";
    }
}
