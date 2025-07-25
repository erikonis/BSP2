package Exercise2;



import java.util.ArrayList;

public class OrderList {

    private String client;
    ArrayList<Order> orderList = new ArrayList<Order>(1);

    public OrderList(String client) {
        this.client=client;
    }

    public void addItem(Order order)
    {
        orderList.add(order);
    }

    public void Order()
    {
        for (int i = 0; i < orderList.size(); i++)
        {
            for (int z = i + 1; z < orderList.size();)
            {
                if (orderList.get(i).getName().equals(orderList.get(z).getName()))
                {
                    if (orderList.get(i).getAmount() == orderList.get(z).getAmount())
                    {
                        if(orderList.get(i).getPrice() == orderList.get(z).getPrice())
                        {
                            orderList.remove(z);
                        }
                    }
                }
                else {z++;}
            }
        }
    
        double totalcost = 0;
        for (int i = 0; i < orderList.size(); i++)
        {
            totalcost = totalcost + orderList.get(i).getPrice()*orderList.get(i).getAmount();    
        }

        System.out.println("Order List for " +client+". You ordered "+orderList.size()+" different products. Total cost is "+ totalcost +" €");
      
        for (int i = 0; i < orderList.size(); i++)
        {
            double OrderPrice = orderList.get(i).getPrice() *orderList.get(i).getAmount();
            System.out.println((i + 1) + ". Order : " + orderList.get(i).getAmount() + " " + orderList.get(i).getName() + " x " + orderList.get(i).getPrice() + " € = " + OrderPrice + " €");  
        }

    }
       
     
        }

    
   

   

   

   
