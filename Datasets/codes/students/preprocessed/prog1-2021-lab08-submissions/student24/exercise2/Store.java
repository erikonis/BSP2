public class Store {
    public static void main(String[] args) {
        Order o1 = new Order("Cola", 0.80, 100);
        Order o2 = new Order("KitKat", 0.70, 250);
        Order o3 = new Order("Orange", 0.72, 350);
        Order o4 = new Order("Chips", 1.60, 150);
        Order o5 = new Order("Cola", 0.80, 100);
        Order o6 = new Order("Snickers", 1.60, 150);
        
        OrderList list = new OrderList("Food for Real Fools");
        list.addItem(o1);
        list.addItem(o2);
        list.addItem(o3);
        list.addItem(o4);
        list.addItem(o5);
        list.addItem(o6);

        list.order();
    }
}
