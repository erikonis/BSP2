package lu.uni.programming1.lab8.exercise2;

public class LauncherEx2 {

    public static void main(String[] args) {
        
        order o1 = new order("Coke", 1.2, 10);
        order o2 = new order("Bucket", 20.8, 2);
        order o3 = new order("Beef Jerky", 10, 5);
        order o4 = new order("Egg x12", 15, 3);
        order o5 = new order("Coke", 1.2, 10);
        order o6 = new order("Beef Jerky", 10, 5);

        orderList l1 = new orderList("Ralidri");

        l1.addItem(o1);
        l1.addItem(o2);
        l1.addItem(o3);
        l1.addItem(o4);
        l1.addItem(o5);
        l1.addItem(o6);

        l1.order();


    }
    
}
