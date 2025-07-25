package exercise2;

import java.util.ArrayList;

public class OrderList {
    ArrayList<Order> orderList = new ArrayList<>();

    public void add(Order otherOrder) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).hashCode() == otherOrder.hashCode() && orderList.get(i).equals(otherOrder)) {
                orderList.remove(i);
            }
        }
        orderList.add(otherOrder);
    }

    public String toString() {
        String text = "";
        for (int i = 0; i < orderList.size(); i++) {
            text+= (i+1)+". Order: "+orderList.get(i).toString()+"\n";
        }
        return text;
    }
}
