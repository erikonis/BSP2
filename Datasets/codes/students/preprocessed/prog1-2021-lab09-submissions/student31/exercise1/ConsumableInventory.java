import java.util.ArrayList;


public class ConsumableInventory  {

    ArrayList<ConsumableItem> consumableItems = new ArrayList<>();
    private final int consumablecapacity = 40; 
    
    void use(int index) {

        if ( (consumableItems.get(index))!=null ) if ((consumableItems.get(index)).isOutOfCharges()==true) consumableItems.remove(index);

    }

    boolean add (ConsumableItem consumableItem) {
        
        if(consumableItems.size()!=consumablecapacity) {
            consumableItems.add(consumableItem); return true;  }
            else {System.out.println("The inventory is full!"); return false; }

    }



    int drop (ConsumableItem item) {

        int count = 0; 

        for (ConsumableItem i :  consumableItems) {if (i.equals(item)) {consumableItems.remove(item); count+=1;};}

        return count;

    }

    boolean drop (int index) {

        if (   consumableItems.get(index)!=null) {consumableItems.remove(consumableItems.get(index)); return true; }
        else return false;

    }



}
