import model.OrderList;

public class Main {
    public static void main(String[] args) {
        OrderList orderList = new OrderList("TheOne Supermarket");
        
        // Add orders - duplicates will be merged
        orderList.addItem("Coke", 0.80, 100);
        orderList.addItem("KitKat", 0.70, 250);
        orderList.addItem("Orange Juice", 0.72, 350);
        orderList.addItem("Snickers", 1.60, 150);
        orderList.addItem("Snickers", 1.60, 150); // Duplicate
        orderList.addItem("Coke", 0.80, 50); // Will merge with existing Coke order
        
        orderList.printOrderSummary();
    }
}