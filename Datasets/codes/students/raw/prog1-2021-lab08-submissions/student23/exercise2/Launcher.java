package lu.uni.programming1.lab8.exercise2;

public class Launcher {
    public static void main(String[] args) {
        Order o1 = new Order("Coke", 0.8, 100);
        Order o2 = new Order("KitKat", 0.7, 250);
        Order o3 = new Order("OrangeJ", 0.6, 350);
        Order o4 = new Order("Snickers", 1.6, 150);
        Order o5 = new Order("Twix", 1.8, 100);
        Order o6 = new Order("Coke", 0.8, 100);
        Order o7 = new Order("MNM", 1.5, 500);

        OrderList list = new OrderList("Snacks");

        list.addItem(o1);
        list.addItem(o2);
        list.addItem(o3);
        list.addItem(o4);
        list.addItem(o5);
        list.addItem(o6);
        list.addItem(o7);

        list.order();
    }
}
