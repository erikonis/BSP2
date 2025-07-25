public class OrderItem {
    private String productName;
    private double unitPrice;
    private int quantity;

    public OrderItem(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return quantity + "x " + productName + " @ " + unitPrice + " EUR each";
    }
}