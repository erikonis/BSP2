public class Main {
    public static void main(String[] args) {
        OrderList orderList = new OrderList("Small Market");

        OrderItem item1 = new OrderItem("Snickers", 1.50, 10);
        OrderItem item2 = new OrderItem("Snickers", 1.50, 10); // Duplicate
        OrderItem item3 = new OrderItem("Mars", 1.20, 5);

        orderList.addItem(item1);
        orderList.addItem(item2); // Should not be added
        orderList.addItem(item3);

        orderList.printOrderList();
    }
}