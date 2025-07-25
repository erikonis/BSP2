public class StoreApp {
    public static void main(String[] args) {
        OrderList orderList = new OrderList("SuperMart");

        orderList.addItem(new OrderItem("Snickers", 1.5, 10));
        orderList.addItem(new OrderItem("Coca-Cola", 2.0, 5));
        orderList.addItem(new OrderItem("Snickers", 1.5, 10)); // Duplicate, will be ignored

        orderList.printOrder();
    }
}