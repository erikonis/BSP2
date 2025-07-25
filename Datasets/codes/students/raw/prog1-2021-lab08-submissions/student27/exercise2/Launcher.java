package lu.uni.programming1.lab8.exercise2;

public class Launcher {
    public static void main(String[] args) {
        Order o1 = new Order("Coke", 0.80, 100);
        Order o2 = new Order("KitKat", 0.70, 250);
        Order o3 = new Order("OrangeJ", 0.72, 350);
        Order o4 = new Order("Snickers", 1.60, 150);
        Order o5 = new Order("Snickers", 1.60, 150);
        Order o6 = new Order("Coke", 0.80, 100);

        OrderList w2 = new OrderList("TheOne");

        w2.addOrder(o1);
        w2.addOrder(o2);
        w2.addOrder(o3);
        w2.addOrder(o4);
        w2.addOrder(o5);
        w2.addOrder(o6);

        w2.order();
    }
}
