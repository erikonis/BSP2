public class Launcher {

    public static void main(String[] args) {

        Order o1 = new Order("Coke", 0.80, 100);
        Order o2 = new Order("KitKat", 0.70, 250);
        Order o3 = new Order("OrangeJ", 0.72, 350);
        Order o4 = new Order("Snickers", 1.60, 150);
        Order o5 = new Order("Snickers", 1.60, 150);
        Order o6 = new Order("Coke", 0.80, 100);
        
        OrderList w2 = new OrderList("Mitch");

        w2.Add(o1);
        w2.Add(o2);
        w2.Add(o3);
        w2.Add(o4);
        w2.Add(o5);
        w2.Add(o6);

        w2.Order();
        
    }
    
}
