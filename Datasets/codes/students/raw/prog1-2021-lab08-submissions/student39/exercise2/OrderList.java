package lu.uni.programming1.lab8.exercise2;

import java.util.HashSet;

public class OrderList {

    private String clientStoreName;
    private HashSet<Order> listOfOrder;
    private double TotalCost=0;
    
    public OrderList(String clientStoreName) {
        this.clientStoreName = clientStoreName;
        this.listOfOrder = new HashSet<Order>();
    } 

    public String getClientStoreName() {
        return clientStoreName;
    }

    public void setClientStoreName(String clientStoreName) {
        this.clientStoreName = clientStoreName;
    }

    public void addOrder(Order order){
        listOfOrder.add(order); 
    }

    public double CostTotal(){
        for(Order o : listOfOrder){
            TotalCost += o.getCost();
        }
        return TotalCost;
    }

    public String PrintSet(){
        int i=1;
        String print = "";
         for(Order o : listOfOrder){
            print += "\n" + i++ +". Order : " + o.getAmount() 
            + " " + o.getItemName() 
            + " x " + o.getItemPrice() 
            + " EURO = " + o.getCost()
            + " EURO" ;
        }
        return print;
    }

    @Override
    public String toString() {
        return "\nOrderList for " + clientStoreName 
        + ". You ordered " + listOfOrder.size()
        + " item(s). Total cost is : " + this.CostTotal()
        + " EURO. List of your Order : \n" + this.PrintSet() + "\n";
    }

}
