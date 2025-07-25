package exercise2;

import java.util.ArrayList;
import java.util.HashSet;

public class OrderList {
    private String name;
    private HashSet<Order> list;
    private Order empty;
    private boolean d;
    private double ordercost;
    private int l, c1, c2, c3;
    private ArrayList<Order> alist;
    OrderList(String name){
        this.name=name;
        list = new HashSet<Order>();
        empty = new Order("nothing", 0.0, 0);
        list.add(empty);
    }
    //constructor for a list of orders and name of recipient
    // starts with a placeholder value to prevent crashes

    //getter for the name of the recipient
    public String getName() {
        return name;
    }


    //method to add something to the list of orders
    public void addItem(Order o){
        d = false;
        //sets a value d to negative
        // this.o=o;
        if (list.contains(empty)){
            list.add(o);
            list.remove(empty);}
            //if the list contains the item "empty", which is a default value, removes it and adds the value input
        else{
            //if the list contains an item, gets the length of the list and sets the counter to 0
            l = alist.size();
            c1 = 0;
            do{if((o.getName()==alist.get(c1).getName())&&(o.getPrice()==alist.get(c1).getPrice())&&(o.getQuantity()==alist.get(c1).getQuantity())){
                    d=true;}
            c1++;
            }while((c1<l)&&(d == false));
            //iterates through the list and checks if the added item is already on the list
            if (d==false){
                list.add(o);}}
            //if the item is not on the list, it's added to the list
        alist = new ArrayList<Order>(list);}

    private void calcOrderCost(){
        //calculates the cost of all the items on the list by adding the total costs of the separate orders together
        c2=0;
        if(list.contains(empty)){
            ordercost = 0.0;}
        // if(alist.size()==1){
        //     ordercost = alist.get(0).getTotalPrice();}
        else{
            do{
                ordercost = ordercost + alist.get(c2).getTotalPrice();
                c2++;
            }while(c2<alist.size());
        }
    }

    public void order(){
        calcOrderCost();
        c3=0;
        if(list.contains(empty)){
            System.out.println("The Order List for "+name+" is empty.");
        }
        else{
        System.out.println("Order List for "+name+". You ordered "+alist.size()+" different products. Total cost is: "+ordercost+" EURO");
        do{
            System.out.println("\t "+(c3+1)+". Order : "+alist.get(c3).getQuantity()+" "+alist.get(c3).getName()+" x "+alist.get(c3).getPrice()+" EURO = "+alist.get(c3).getTotalPrice()+" EURO");
            c3++;}while(c3<alist.size());}
            //prints the list nicely as requested
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    
}
