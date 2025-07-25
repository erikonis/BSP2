public class Launcher {
    public static void main(String[] args) {
        
        Order od1 = new Order("Orange", 0.7, 100);
        Order od2 = new Order("Orange", 0.7, 100);
        Order od3 = new Order("Coke", 1.2, 150);
        Order od4 = new Order("Beer", 2.5, 60);
        Order od5 = new Order("Apple", 1, 120);

        OrderList list = new OrderList("TheOne");

        list.addItem(od1);
        list.addItem(od2);
        list.addItem(od3);
        list.addItem(od4);
        list.addItem(od5);
        list.addItem(od3);
        list.addItem(od3);

        list.order();
    }
}
