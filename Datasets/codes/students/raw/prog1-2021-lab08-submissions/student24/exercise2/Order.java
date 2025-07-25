package exercise2;

import java.util.Objects;

public class Order {
    private String product;
    private double unitPrice;
    private int quantity;

    public Order(String product, double unitPrice, int quantity) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int hashCode() {
        return 7 * Objects.hashCode(product)
        + 13 * Double.hashCode(unitPrice)
        + 17 * Integer.hashCode(quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() == obj.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
}
