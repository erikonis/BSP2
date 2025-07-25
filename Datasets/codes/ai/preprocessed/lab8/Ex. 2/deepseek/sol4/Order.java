public class Order {
    private final OrderItem item;
    private int quantity;

    public Order(OrderItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void addQuantity(int additionalQuantity) {
        this.quantity += additionalQuantity;
    }

    public OrderItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return item.getUnitPrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format("%d x %s = €%.2f",
               quantity, item, getTotalPrice());
    }
}