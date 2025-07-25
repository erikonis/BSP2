import java.util.HashSet;
import java.util.Iterator;

public class OrderList{
    String name;
    Order order;
    HashSet<Order> h = new HashSet<Order>();
    
    OrderList(String name){
        this.name = name;
    }

    public HashSet<Order> addItem(Order order){
        h.add(order);
        return h;
    }


    public void order(){
        System.out.println("Order List for " + name + ". " + "You ordered " + h.size() + " different products. " + "\n" + h.toString());
    }
}
