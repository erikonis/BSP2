package model;

import java.util.Objects;

public class OrderItem {
    private final String productName;
    private final double unitPrice;

    public OrderItem(String productName, double unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Double.compare(orderItem.unitPrice, unitPrice) == 0 &&
                Objects.equals(productName, orderItem.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, unitPrice);
    }

    @Override
    public String toString() {
        return productName + " (€" + unitPrice + ")";
    }
}