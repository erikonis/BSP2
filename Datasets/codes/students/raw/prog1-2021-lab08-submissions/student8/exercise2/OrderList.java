package exercise2;

import java.util.HashSet;

public class OrderList {
    String client;
    HashSet<Order> orderList;

    public OrderList(String client) {
        this.client = client;
        orderList = new HashSet<>();
    }

    public void addItem(Order e) {
        orderList.add(e);
    }


    

    public void order(){
        double total=0;
        for(Order order : orderList)
        total += order.cost();

        System.err.println("Order List for "+client+". You ordered "+orderList.size()+" different products. Total cost is : "+total+" EURO");
        int i=1;
        for(Order order : orderList)
        System.out.println((i++)+". Order : "+order.toString());
    }

}
