package exercise2;

import java.util.HashSet;

public class OrderList {
    private String clientStore;
    private HashSet<Order> orderSet;

    public OrderList(String clientStore) {
        this.clientStore = clientStore;
        orderSet = new HashSet<Order>();
    }

    public boolean isDuplicate(Order susOrder){
        for (Order order : orderSet) {
            if(order.getName().equals(susOrder.getName()) &&
               order.getQuantity()==susOrder.getQuantity() &&
               order.getUnitPrice()==susOrder.getUnitPrice()){
                return true;
            }
        }
        return false;
    }

    public void addItem(Order order){
        if(!isDuplicate(order)){
            orderSet.add(order);
        }
    }

    public void order(){
        boolean multipleProducts = orderSet.size()>1 ? true : false;
        double totalPrice=0;

        for (Order order : orderSet) {
            totalPrice += (order.getUnitPrice()*order.getQuantity());
        }
        System.out.print("Order list for "+clientStore+". You ordered "+orderSet.size());
        if(multipleProducts){
            System.out.print(" different products.");
        }
        else{
            System.out.print(" product.");
        }
        System.out.println(" Total cost: "+ totalPrice+" EURO");
        int index = 1;
        for (Order order : orderSet) {
            System.out.println(index+". Order: "+order.getQuantity()+" "+order.getName()+" X "+order.getUnitPrice()+" EURO = Total: "+order.getUnitPrice()*order.getQuantity());
            index++;
        }
    }
}
