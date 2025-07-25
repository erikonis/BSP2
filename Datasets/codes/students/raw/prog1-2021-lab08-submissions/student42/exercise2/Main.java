package lu.uni.programming1.lab8.exercise2;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Coke", 0.80, 100);
        Order o2 = new Order("KitKat", 0.70, 250);
        Order o3 = new Order("OrangeJ", 0.72, 350);
        Order o4 = new Order("Snickers", 1.60, 150);
        Order o5 = new Order("Snickers", 1.60, 150);
        Order o6 = new Order("Coke", 0.80, 100);
        Order o7 = new Order("Mars", 0.80, 75);
        Order o8 = new Order("Fanta", 1.40, 50);
        Order o9 = new Order("Mars", 0.80, 75);

        OrderList w2 = new OrderList("TheWho");

        w2.addItem(o1);
        w2.addItem(o2);
        w2.addItem(o3);
        w2.addItem(o4);
        w2.addItem(o5);
        w2.addItem(o6);
        w2.addItem(o7);
        w2.addItem(o8);
        w2.addItem(o9);

        w2.order();
    }
}
