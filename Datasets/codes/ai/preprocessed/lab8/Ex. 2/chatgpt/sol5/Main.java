public class Main {
    public static void main(String[] args) {
        // Create order items
        OrderItem item1 = new OrderItem("Laptop", 1200.0, 2);
        OrderItem item2 = new OrderItem("Smartphone", 800.0, 5);
        OrderItem item3 = new OrderItem("Tablet", 400.0, 3);
        OrderItem item4 = new OrderItem("Laptop", 1200.0, 2);  // Duplicate of item1
        OrderItem item5 = new OrderItem("Smartphone", 800.0, 5);  // Duplicate of item2

        // Create an order
        Order order = new Order("TechShop");

        // Add items to the order (duplicates should not be added)
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);
        order.addItem(item4);  // This is a duplicate of item1
        order.addItem(item5);  // This is a duplicate of item2

        // Print the order details
        order.printOrderDetails();
    }
}