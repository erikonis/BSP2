package Exercise2;

import java.util.ArrayList;

public class OrderList {
    
    private ArrayList<Order> orderList = new ArrayList<>();
    private String orderListName;
    
    public OrderList(String orderListName) {
        this.orderListName = orderListName;
    }

    public boolean addItem(Order e) {
        for(int i=0; i< orderList.size(); i++)
        {
            if(e.equals(orderList.get(i)) && e.hashCode()==orderList.get(i).hashCode())
            {
                orderList.remove(i);
            }
        }
        orderList.add(e);
        return true;
    }

    public Order get(int index) {
        return orderList.get(index);
    }

    public double totalCost()
    {
        double total=0;
        for(Order order : orderList)
        {
            total += order.orderPrice();
        }
        return total;
    }

    public Order remove(int index) {
        return orderList.remove(index);
    }

    public String printOrderList()
    {
        String list="";
        int i=1;
        for(Order order : orderList)
        {
            list += i + ". " + order + "\n\t";
            i++;
        }
        return list;
    }

    public String order() {
        return "Order List for " + orderListName + ". You ordered " + orderList.size() + " different products. Total cost is: " + totalCost() + " EURO\n\t" + printOrderList();
    }

    

}
