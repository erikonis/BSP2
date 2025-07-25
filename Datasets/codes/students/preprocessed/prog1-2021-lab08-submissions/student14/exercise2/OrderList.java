import java.util.HashSet;

public class OrderList {

    private String recipient;
    private double totalCost = 0;
    private HashSet<Order> orderList;
    
    public HashSet<Order> getOrderList() {
        return orderList;
    }

    public OrderList(String recipient) {
        this.setRecipient(recipient);
        orderList = new HashSet<Order>();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    
    public void addItem(Order order) {
        boolean exist = false;
        for (Order o : orderList) {
            
            if(o.equals(order)){
                exist = true;
            }
        }
        if(exist == false){
            orderList.add(order);
        }
    }

    public void order() {
        for(Order order: orderList) {
            totalCost += order.getUnitPrice()*order.getQuantity();
        }
    }

    public String toString() {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Order List for "+getRecipient()+". You ordered "+orderList.size());
        if(orderList.size()==1) {
            sb.append("product. Total cost is: "+totalCost+" EURO");
        }else if(orderList.size()>1){
            sb.append("different products. Total cost is: "+totalCost+" EURO");
        }
        for(Order order: orderList) {
            sb.append(++i+". Order : "+order.getQuantity()+" "+order.getItemName()+" x "+
            order.getUnitPrice()+" EURO = "+totalCost+" EURO");
        }
        return sb.toString();
    }
}
