public class launcher {

  public static void main(String[] args) {

    Order o1 = new Order("Coke", 0.80, 100);
    Order o2 = new Order("KitKat", 0.70, 250);
    Order o3 = new Order("OrangeJ", 0.72, 350);
    Order o4 = new Order("Snickers", 1.60, 350);
    Order o5 = new Order("Snickers", 1.60, 350);
    Order o6 = new Order("Coke", 0.80, 100);

    OrderList w2 = new OrderList();

    // add

    w2.add(o1);
    w2.add(o2);
    w2.add(o3);
    w2.add(o4);
    w2.add(o5);
    w2.add(o6);

    // output

    System.out.println(w2.print());

  }

}