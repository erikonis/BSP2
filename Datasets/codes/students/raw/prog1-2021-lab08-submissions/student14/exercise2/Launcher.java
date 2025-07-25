package exercise2;

public class Launcher {public static void main(String[] args) {
    Order o1 = new Order("Kitkat", 0.70, 250);
    Order o2 = new Order("Snickers", 1.60,150);
    Order o3 = new Order("Snickers", 1.60,150);
    Order o4 = new Order("OrangeJ", 0.72,350);
    Order o5 = new Order("Lemon", 1.15,50);
    Order o6 = new Order("Watermelon", 1.50, 20);

    OrderList w2 = new OrderList("TheOne");

    w2.addItem(o1);
    w2.addItem(o2);
    w2.addItem(o3);
    w2.addItem(o4);
    w2.addItem(o5);
    w2.addItem(o6);

    w2.order();

    System.out.println(w2.toString());

}
    
}
