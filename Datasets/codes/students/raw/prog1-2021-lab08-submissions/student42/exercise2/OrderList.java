package lu.uni.programming1.lab8.exercise2;

import java.util.HashSet;

public class OrderList {
    
    private String clientStore;
    private HashSet<Order> orderList;
    private int size;
    
    public OrderList(String clientStore) {
        this.clientStore = clientStore;
        this.size = size;
        this.orderList = new HashSet<>();
        
    }
    
    public void addItem(Order order) {
        orderList.add(order);
    }
    
    public int getSize(){
        return orderList.size();
    }

    public String getStoreName() {
        return clientStore;
    }
    
       
    public double getTotal() {
        double total = 0;
        for(Order order : orderList){
            total += order.calc();
        }
        return total;
    }


    public void order() {
        System.out.println("Order List for " + getStoreName() + ". Your ordered " + orderList.size() + " different products. Total cost is: " + getTotal() + " EURO"+"\n");
        int count = 1;
        for(Order order : orderList) {
        System.out.println("Order "+ count + ": " + order.toString() );
        count++;
        }
        System.out.println();
        System.out.println("Thank you for your order!\n");
    }
}
