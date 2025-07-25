public class Main {
    public static void main(String[] args) {

        // HashSet<Order> OrderOfClient1= new HashSet<Order>();
        
        Order o1 = new Order("Coke",0.80,100);
        Order o2 = new Order("KitKat",0.70,250);
        Order o3 = new Order("OrangeJ",0.72,350);
        Order o4 = new Order("Snickers",1.60,150);
        Order o5 = new Order("Snickers",1.60,150);
        Order o6 = new Order("Coke",0.80,100);

        OrderList OrderClient1 = new OrderList("TheOne");

        OrderClient1.addOrder(o1);
        OrderClient1.addOrder(o2);
        OrderClient1.addOrder(o3);
        OrderClient1.addOrder(o4);
        OrderClient1.addOrder(o5);
        OrderClient1.addOrder(o6);

        System.out.println(OrderClient1);

    }
    
}
