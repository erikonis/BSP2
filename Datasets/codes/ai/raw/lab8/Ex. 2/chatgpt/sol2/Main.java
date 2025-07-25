public class Main {
    public static void main(String[] args) {
        OrderList order = new OrderList("Market ABC");
        
        order.addItem(new OrderItem("Snickers", 1.50, 10));
        order.addItem(new OrderItem("Coca Cola", 2.00, 5));
        order.addItem(new OrderItem("Snickers", 1.50, 10));  // Duplicate
        
        order.printOrder();
    }
}