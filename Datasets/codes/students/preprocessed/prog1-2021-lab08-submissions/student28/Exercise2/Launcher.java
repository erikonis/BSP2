public class Launcher{

    public static void main(String[] args){

        Order o1 = new Order("Tissue", 0.50 , 100);
        Order o2 = new Order("Toilet paper", 0.70 , 80);
        Order o3 = new Order("Pink leather pants", 50.0, 60);
        Order o4 = new Order("Rc car", 120.0, 12);
        Order o5 = new Order("Plastic gun", 1, 80);

        OrderList or1 = new OrderList("First");
        or1.addItem(o1);
        or1.addItem(o2);
        or1.addItem(o3);
        or1.addItem(o4);
        or1.addItem(o5);

        or1.order();

        



        
    }
}