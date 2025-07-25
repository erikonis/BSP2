import java.util.ArrayList;

public class Test {





    public static void main(String[] args) {
        

        Order o1 = new Order ("Coke", 0.80, 100);
        Order o2 = new Order ("KitKat", 0.70, 250);
        Order o3 = new Order ("OrangeJ", 0.72, 350);
        Order o4 = new Order ("Snickers", 1.60, 150); 
        Order o5 = new Order ("Snickers", 1.60, 150);
        Order o6 = new Order ("Coke", 0.80, 100);

        ArrayList<Order> OrderList = new ArrayList();

        OrderList.add(o1);
        OrderList.add(o2);
        OrderList.add(o3);
        OrderList.add(o4);
        OrderList.add(o5);
        OrderList.add(o6);


        for (Order j : OrderList) for (Order q : OrderList) if (j.name.hashCode()==q.name.hashCode()) OrderList.remove(j);;

        for (Order i : OrderList) {System.out.println(i.name+" "+i.price+" " +i.quantity);};
















    }
    
}
