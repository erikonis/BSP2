import java.util.ArrayList;

public class orderList {

    private String clientName;
    ArrayList<order> orderList = new ArrayList<order>(1);

    public orderList(String clientName) {
        this.clientName = clientName;
    }

    public void addItem(order order)
    {
        orderList.add(order);
    }

    public void order()
    {
        for (int i = 0; i < orderList.size(); i++)
        {
            for (int j = i + 1; j < orderList.size();)
            {
                if (orderList.get(i).getName().equals(orderList.get(j).getName()))
                {
                    if (orderList.get(i).getAmount() == orderList.get(j).getAmount())
                    {
                        if(orderList.get(i).getPrice() == orderList.get(j).getPrice())
                        {
                            orderList.remove(j);
                        }
                    }
                }
                else {j++;}
            }
        }

        double tCost = 0;
        for (int i = 0; i < orderList.size(); i++)
        {
            tCost += orderList.get(i).getPrice() *orderList.get(i).getAmount();    
        }

        System.out.println("Order List for " + clientName + ". You ordered " + orderList.size() + " different products. Total cost is " + tCost + " €");
        for (int i = 0; i < orderList.size(); i++)
        {
            double perOrderPrice = orderList.get(i).getPrice() *orderList.get(i).getAmount(); 
            System.out.println((i + 1) + ". Order : " + orderList.get(i).getAmount() + " " + orderList.get(i).getName() + " x " + orderList.get(i).getPrice() + " € = " + perOrderPrice + " €");  
        }

    }
    

    

    

    
}
