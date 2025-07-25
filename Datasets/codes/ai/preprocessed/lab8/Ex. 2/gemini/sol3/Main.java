public class Main {
    public static void main(String[] args) {
        OrderList megaMartOrder = new OrderList("Mega Mart");

        megaMartOrder.addItem(new OrderItem("Laptop", 1200.00, 2));
        megaMartOrder.addItem(new OrderItem("Mouse", 25.50, 5));
        megaMartOrder.addItem(new OrderItem("Keyboard", 75.00, 3));
        megaMartOrder.addItem(new OrderItem("Laptop", 1200.00, 2)); // Duplicate
        megaMartOrder.addItem(new OrderItem("Monitor", 300.00, 2));
        megaMartOrder.addItem(new OrderItem("Mouse", 25.50, 5));    // Duplicate
        megaMartOrder.addItem(new OrderItem("Webcam", 50.00, 4));
        megaMartOrder.addItem(new OrderItem("Keyboard", 75.00, 2)); // Not a duplicate (different amount)
        megaMartOrder.addItem(new OrderItem("Laptop", 1199.99, 2)); // Not a duplicate (different price)

        megaMartOrder.printOrder();

        OrderList superSaveOrder = new OrderList("Super Save");
        superSaveOrder.addItem(new OrderItem("Bread", 2.00, 10));
        superSaveOrder.addItem(new OrderItem("Milk", 1.50, 5));
        superSaveOrder.addItem(new OrderItem("Eggs", 3.20, 2));
        superSaveOrder.addItem(new OrderItem("Bread", 2.00, 10)); // Duplicate
        superSaveOrder.addItem(new OrderItem("Cheese", 5.50, 3));

        superSaveOrder.printOrder();
    }
}