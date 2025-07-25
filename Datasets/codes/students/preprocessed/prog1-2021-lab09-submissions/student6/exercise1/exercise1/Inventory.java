import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    private int capacity;
    private ArrayList<Item> inventory;

    public Inventory(int capacity) {
        this.capacity = capacity;
        inventory = new ArrayList<>();
    }

    public boolean add(Item item) {
        /* System.out.println("size "+inventory.size()+" cap "+capacity); */
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
        System.out.println(itemsDropped+" "+item.toString()+" have been dropped");
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
            if(((Consumable) item).getCharges()>0)
                ((Consumable) item).use();
                    if(((Consumable) item).getCharges()==0){
                        System.out.println("No charges left, Consumable thrown away");
                        inventory.remove(item);
                    }
        }
        else
            item.use();       
    }

    public boolean sell(int index) {
        Item item = inventory.get(index);

        if(item instanceof Trash || item instanceof Consumable){
            inventory.remove(index);
            System.out.println("Sold Item :"+item.toString());
            return true;
        }
        else{
            System.out.println("Cannot sell Gear");
            return false;
        }
            
    }

    public void sort() {
        Collections.sort(inventory);
    }

    @Override
    public String toString() {
        String str="\nInventory:\n";
        for(int i=0; i<inventory.size();i++){
            str = str+"{"+i+"} "+inventory.get(i).toString()+"\n";
        }
        return str;
    }

    
}
