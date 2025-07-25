public class Launcher {
    public static void main(String[] args) {
        Order o1 = new Order ("Morgana skin", 5.50, 150);
        Order o2 = new Order ("Ruined King (PC)", 30.00, 50);
        Order o3 = new Order ("Netflix Subscription", 12.50, 35);
        Order o4 = new Order ("Chips", 1.50, 400);
        Order o5 = new Order ("Chips", 1.50, 400);
        Order o6 = new Order ("Morgana skin", 5.50, 150);

        OrderList w1= new OrderList("Sara's");

        w1.addItem(o1);
        w1.addItem(o2);
        w1.addItem(o3);
        w1.addItem(o4);
        w1.addItem(o5);
        w1.addItem(o6);

        w1.order();
        
    
    
    
    }
}
