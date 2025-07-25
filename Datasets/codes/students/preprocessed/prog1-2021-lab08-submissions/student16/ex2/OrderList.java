import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class OrderList {

    // define Hashset
    private HashSet<Order> Orderlist = new HashSet<Order>();

    public OrderList() {

    }

    // to add to the hashset
    public void add(Order Order1) {
        Orderlist.add(Order1);

    }

    // to remove from the hashset
    public void remove(Order Order1) {
        Orderlist.remove(Order1);
    }

    public String print() {
        String text = "";
        // the usual for loop does not work for the hashset
        /*
         * for (int s = 0; s < Order.size(); s++) {
         * text += Order.get(s).toString();
         * }
         */
        // you have to use this for loop ->for the hashset
        for (Order Order : Orderlist)
            System.out.println(Order.toString());
        return text;
    }

    @Override
    public String toString() {
        return "OrderList [Orderlist=" + Orderlist + "]";
    }
}