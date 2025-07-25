import java.util.Objects;

public class Order {
    private final String productName;
    private final double unitPrice;
    private final int amount;

    public Order(String productName, double unitPrice, int amount) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public double getTotalPrice() {
        return unitPrice * amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.unitPrice, unitPrice) == 0 &&
                amount == order.amount &&
                Objects.equals(productName, order.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, unitPrice, amount);
    }

    @Override
    public String toString() {
        return String.format("%d %s x %.2f EURO = %.1f EURO",
                amount, productName, unitPrice, getTotalPrice());
    }
}