package Exercise2;

import java.util.ArrayList;

public class OrderList {
    
    private String name;
    private ArrayList<Order> Orderlist;

    public OrderList(String name){
        this.name = name;
        Orderlist = new ArrayList<>();
    }
    
    public void addItem(Order e) {
        if(check(e) == true){
            Orderlist.add(e);
        }
    }

    public boolean check(Order e){
        boolean condition = true;
        for(int i = 0; i<Orderlist.size();i++)
        {
            if(Orderlist.get(i).equals(e))
            {
                condition = false;
                   
            }
        }
        return condition;

    }
    public double totalCost(){
        double total = 0;
        for (Order orderList : Orderlist) {
            total += orderList.getTotal();
        }
        return total;
    }
    public void order(){
        sort();
        System.out.println("Order List for " + name + ". You ordered " + Orderlist.size() + " diffrent products. Total cost is: " + totalCost() + " EURO" );
        for (int i = 0; i < Orderlist.size(); i++) {
            System.out.println(i+1 + ". Order : " + Orderlist.get(i).toString());
        }
    }
   
    public void sort(){
        for (int i = 0; i < Orderlist.size(); i++) {
            for (int j = 0; j < Orderlist.size(); j++) {
                if(Orderlist.get(i).getAmount()>Orderlist.get(j).getAmount()){
                    Order tmp = Orderlist.get(i);
                    Orderlist.set(i, Orderlist.get(j));
                    Orderlist.set(j, tmp);
                }
            }
        }
    }


}
