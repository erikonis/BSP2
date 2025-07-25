package Exercises.exercise2;

import java.util.ArrayList;
import java.util.HashSet;

public class OrderList {
    HashSet<Order>orderl = new HashSet<>();
    private String name;
    public OrderList(String name) {
        this.name = name;
    }

    public void addItem(Order order)
    {
        orderl.add(order);
        
    }

   
    
    public double totalcost()
    {
        ArrayList<Order> orderal= new ArrayList<>(orderl);
     double cost=0;
     for(int i=0;i<orderal.size();i++)
     {
         cost+=orderal.get(i).cost();
     }
     return cost;
    }
    
    public void order()
    {
        ArrayList<Order> orderal= new ArrayList<>(orderl);
        for(int i=0;i<orderal.size()-1;i++)
        {
            Order min=orderal.get(i);
            for(int j=i+1;j<orderal.size();j++)
            {
                if(min.getAmount()<orderal.get(j).getAmount())
                {
                    
                    min=orderal.get(j);
                    orderal.set(j,orderal.get(i));
                    orderal.set(i, min);
                   
                }
            }
        }
        System.out.println("Order List for "+name+". You orderd "+orderl.size()+" different products. Total cost is: "+totalcost()+" EURO.");
        for(int i=0;i<orderal.size();i++)
        {
            System.out.println((i+1)+". Order : "+orderal.get(i).getAmount()+" "+orderal.get(i).getName()+" x "+orderal.get(i).getUnitprice()+" EURO = "+orderal.get(i).cost()+" EURO");
        }
    }
    
    
}
