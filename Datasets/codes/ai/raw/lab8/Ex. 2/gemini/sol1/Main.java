public class Main {
    public static void main(String[] args) {
        OrderList orderList = new OrderList("Supermarket A");
        orderList.addItem(new OrderItem("Snickers", 1.50, 10));
        orderList.addItem(new OrderItem("Coca-Cola", 2.00, 5));
        orderList.addItem(new OrderItem("Snickers", 1.50, 10)); // Duplicate
        orderList.addItem(new OrderItem("Mars", 1.20, 15));

        orderList.printOrder();
    }
}