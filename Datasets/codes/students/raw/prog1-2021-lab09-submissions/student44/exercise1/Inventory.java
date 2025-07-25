package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;

public class Inventory {
private int capacity=7;
private ArrayList<Items> items=new ArrayList<Items>(capacity);    
private int index=0;
private int counter = 0; 
    
public int getIndex() {
    return index;
}

public Inventory() {
    ;
}

public ArrayList<Items> getItems() {
    return items;
}

public int getCapacity() {
    return capacity;
}

public int getCounter(){
    return counter;
}

boolean add(Items item){
    if (items.size()<getCapacity()){// size is number of elements inside arraylist
        items.add(item);
        System.out.println("Added item to inventory: "+item);
        return true;
    } 
    else return false;
}          
    

int drop(Items item){

    int itemsDropped=0;
    for (int i=0; i<items.size(); i++)
    if(items.get(i).equals(item)&&items.get(i)!=null)
    items.remove(item);
    itemsDropped++;
    return itemsDropped;
}

boolean drop(int index){
    if (items.get(index)!=null)
    {items.remove(index);
    return true;}
    else
    return false;
}

public void use(int index){
    if (items.get(index) instanceof Consumable){
        if (items.get(index).getCharges()==0)//initiate getcharges in items when calling getcharges it is taken over from consumable
        System.out.println("Used item has no charges left and has been dropped");
        items.remove(index);       
    }
    else{
        System.out.println("The item cannot be used throught the inventory.");
    }
}

boolean sell(int index){
    if(items.get(index) instanceof Gear)//if get i is not an instance of gear the item can be sold
    {System.out.println("The following item cannot be sold: "+items.get(index));
    return false;}
    else 
    {System.out.println("Item sold: "+items.get(index));
        items.remove(index);  
    return true;}   
}

public void printLlist(){
    System.out.println("Inventory ("+getCapacity()+")");
    for(Items i: getItems()){
    counter++;
    
    System.out.println("{"+getCounter()+"} "+i);
}
}

@Override
public String toString() {
    
    return "Inventory: ("+getCapacity()+")\n"+"{"+getCounter()+"}"+getItems();
}





}
