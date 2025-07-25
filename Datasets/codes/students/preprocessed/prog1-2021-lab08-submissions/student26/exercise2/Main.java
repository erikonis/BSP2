public class Main {
    public static void main(String[] args) {

        //
        Order o1 =  new Order("Coke",0.80,100);
        Order o2 =  new Order("Kitkat",0.70,250);
        Order o3 =  new Order("Orange3",0.72,350);
        Order o4 =  new Order("Snickers",1.60,150);
        Order o5 =  new Order("Snickers",1.60,150);
        Order o6 =  new Order("Coke",0.80,100);

        OrderList w2 = new OrderList("TheOne");
        w2.addItem(o1);
        w2.addItem(o2);
        w2.addItem(o3);
        w2.addItem(o4);
        w2.addItem(o5);
        w2.addItem(o6);

        w2.order();

    }
}
