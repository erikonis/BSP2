package exercise2;

import java.util.HashSet;

public class OrderList {

    private double totalPrice;
    private String orderListName;
    private HashSet<Order> hsOrder = new HashSet<>();
    Order[] alOrders = hsOrder.toArray(new Order[hsOrder.size()]);

    public void createArray(){
        alOrders = hsOrder.toArray(new Order[hsOrder.size()]);
    }
    

    public OrderList(String orderListName) {
        this.orderListName = orderListName;
    }

    public String getOrderListName() {
        return orderListName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setOrderListName(String orderListName) {
        this.orderListName = orderListName;
    }

    public boolean add(Order a) {
        return hsOrder.add(a);
    }

    public int size() {
        return hsOrder.size();
    }



    @Override
    public String toString() {
        return  hsOrder + "";
    }

}
