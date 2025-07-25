package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;
import java.util.Iterator;




public class Inventory {
    
private ArrayList<Item> items;
private int capacity;

   public Inventory(int capactity){
   items = new ArrayList<Item>();
   this.capacity = capactity;
   }

   public boolean add(Item item){
       if (items.size() < capacity){
        items.add(item);
        System.out.println("Item '" + item.getName() + "' Successfully added to inventory!");
        return true;
    }
        else {
            System.out.println("Couldn't add Item to Inventory, max capacity reached!");
        } return false;
    }

    public boolean drop(int index){
        if (index >= items.size()){
            System.out.println("No such item exists!");
            return false;
        }
        else {
            System.out.println("Item: " + items.get(index).toString() + ", at Index: " + index + ", has been dropped" );
            items.remove(index);
        return true; }

    }

    public void use(int index){

        if (index < items.size()){
            items.get(index).use();
            if (items.get(index) instanceof  ConsItem){
                if (items.get(index).getCharge() == 0){
                    System.out.println("Item: " + items.get(index).toString() + ", at Index: " + index + ", has been dropped" );
                    items.remove(index);
                }
    
            }
        }
        else {
            System.out.println("This item doesn't exist");  
        }
        
    }

    public boolean sell(int index){
        if (index < items.size()){
            if (items.get(index) instanceof  ConsItem || items.get(index) instanceof  TrashItem ){
                System.out.println("Item sold: " + items.get(index).toString());
                items.remove(index);
                return true; 
            }
            else {
                System.out.println("The following item cannot be sold: " + items.get(index).toString());
                return false;
            }
        }
       else {
        System.out.println("This item doesn't exist"); 
        return false;
       }
    }
           
      


   public int drop(Item item){
       int count = 0;
       if (items.contains(item)){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i) != null){
            if (item.getName().equals(items.get(i).getName())){
                items.remove(i);
                count ++;
                i--;
            }

       }
    }
       System.out.println("Dropped " + count + " instances of item: " + item.toString());
       return count;
       }
       else {
        System.out.println("This item doesn't exist");
       return count;
    }
   }



   @Override
   public String toString(){
       System.out.println();
       String str = "";
       Iterator<Item> iter = items.iterator();
       int index=0;
        while(iter.hasNext()){
            System.out.print("{"+index+"} ");
            System.out.println(iter.next().toString());
            index ++;
        }
       System.out.println();
       return str;
       
   }

}
