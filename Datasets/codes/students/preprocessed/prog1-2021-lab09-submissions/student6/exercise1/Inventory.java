import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Inventory {
    private int capacity;
    private ArrayList<Item> inventory;

    public Inventory(int capacity) {
        capacity = this.capacity;
        inventory = new ArrayList<>();
    }

    public boolean add(Item item) {
        if(inventory.size() < capacity){ 
            inventory.add(item);
            return true;
        }
        else   
            return false;
    }
    
    public int drop(Item item) {
        int itemsDropped=0;
        for(int i=0;i<inventory.size();i++){
            if(inventory.get(i)!=null && inventory.get(i).equals(item))
                itemsDropped++;
        }
        inventory.removeAll(Collections.singleton(item));

        return itemsDropped;
    }


    public boolean drop(int index){
        if(inventory.get(index)==null){
            return false;
        }
        else{
            inventory.remove(index);
            return true;
    }
    }

    public void use(Item item) {
        if(item instanceof Consumable){
            ((Subclass) item).getCounter();
        }
            
    }
}
