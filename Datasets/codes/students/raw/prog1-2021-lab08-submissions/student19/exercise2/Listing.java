package exercise2;

public class Listing {
    public static void main(String[] args) {
        Inventor o1 = new Inventor("Coke", 0.80, 100);
        Inventor o2 = new Inventor("KitKat", 0.70, 250);
        Inventor o3 = new Inventor("OrangeJ", 0.72, 350);
        Inventor o4 = new Inventor("Snickers", 1.60, 150);
        Inventor o5 = new Inventor("Snickers", 1.60, 150);
        Inventor o6 = new Inventor("Coke", 0.80, 100);

        Orderlist w2 = new Orderlist("The one");

        w2.addItem(o1);
        w2.addItem(o2);
        w2.addItem(o3);
        w2.addItem(o4);
        w2.addItem(o5);
        w2.addItem(o6);

        w2.order();
    }
}
