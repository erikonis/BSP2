import java.util.ArrayList;
 
public class OrderList {
    private ArrayList <Order> orderlist;
    private String clientName;


    public OrderList(String clientName) {
        orderlist = new ArrayList<Order>();
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }
    
    public void addItem(Order or){
        orderlist.add(or);
    }

    public void order(){

        for(int x=0;x<orderlist.size()-1; x++){
            
            for(int y=x+1;y<orderlist.size();y++){
                if(orderlist.get(x).equals(orderlist.get(y)))
                    orderlist.remove(y);            
            }
        }

        for(Order or: orderlist){
            System.out.println(or);
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
       for (int i=0; i<orderlist.size();i++){
        totalCost = totalCost + orderlist.get(i).getTotalPrice();
       }
        return totalCost;
    }
    
    @Override
    public String toString() {
        return "Order List for " + clientName + ". Total cost is: "+getTotalCost()+" EURO";
    }   
}
