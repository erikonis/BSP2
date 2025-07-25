package lu.uni.programming1.lab8.Exercise2;

public class launcher {
    public static void main(String[] args) {
        order order1 = new order("Coke", 1.05, 200);
        order order2 = new order("Fanta", 2.36, 10);
        order order3 = new order("Pepsi", 1.22, 60);
        order order4 = new order("7up", 1.55, 40);

        orderedList l = new orderedList("The one");
        l.addItem(order1);
        l.addItem(order2);
        l.addItem(order3);
        l.addItem(order4);
        l.order();
    }
}