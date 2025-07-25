public class OrderItemWrapper {
    private OrderItem orderItem;

    public OrderItemWrapper(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemWrapper that = (OrderItemWrapper) o;
        return orderItem.equals(that.orderItem);
    }

    @Override
    public int hashCode() {
        return orderItem.hashCode();
    }

    @Override
    public String toString() {
        return orderItem.toString();
    }
}