package lu.uni.programming1.lab8.exercise2;

import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orderList;
    private String clientName;

    public OrderList(String clientName) {
        orderList = new ArrayList<Order>();
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public void addItem(Order or) {
        orderList.add(or);
    }

    public void order() {

        for (int x = 0; x < orderList.size() - 1; x++) {
            for (int y = x + 1; y < orderList.size(); y++) {
                if (orderList.get(x).equals(orderList.get(y)))
                    orderList.remove(y);
            }
        }

        for (Order or : orderList) {
            System.out.println(or);
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < orderList.size(); i++) {
            totalCost = totalCost + orderList.get(i).getTotalPrice();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order List for " + clientName + "You ordered 4 different products. Total cost is: " + getTotalCost()
                + " EURO";
    }
}
