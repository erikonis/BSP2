import java.util.Objects;

public class OrderItem {
    private String productName;
    private double unitPrice;
    private int amount;

    public OrderItem(String productName, double unitPrice, int amount) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem other = (OrderItem) o;
        return Double.compare(other.unitPrice, unitPrice) == 0 &&
               amount == other.amount &&
               Objects.equals(productName, other.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, unitPrice, amount);
    }

    @Override
    public String toString() {
        return String.format("Item: %s, Price: %.2f EUR, Amount: %d", productName, unitPrice, amount);
    }
}