public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Coke", 0.8, 100);
        Order o2 = new Order("Kitkat", 0.7, 250);
        Order o3 = new Order("OrangeJ", 0.72, 350);
        Order o4 = new Order("Snickers", 1.6, 150);
        Order o5 = new Order("Snickers", 1.6, 150);
        Order o6 = new Order("Coke", 0.8, 100);
        OrderList oList= new OrderList();

        oList.add(o1);
        oList.add(o2);
        oList.add(o3);
        oList.add(o4);
        oList.add(o5);
        oList.add(o6);

        System.out.println(oList.toString());
    }
}
