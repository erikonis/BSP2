public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Coke", 0.80, 100);
        Order o2 = new Order("KitKat", 0.70, 250);
        Order o3 = new Order("Orange", 0.72, 350);
        Order o4 = new Order("Snickers", 1.60, 150);
        Order o5 = new Order("Snickers", 1.60, 150);
        Order o6 = new Order("Coke", 0.80, 100);

        OrderList orderList = new OrderList("TheOne");
        orderList.addItem(o1);
        orderList.addItem(o2);
        orderList.addItem(o3);
        orderList.addItem(o4);
        orderList.addItem(o5);
        orderList.addItem(o6);

        orderList.printOrderList();
    }
}