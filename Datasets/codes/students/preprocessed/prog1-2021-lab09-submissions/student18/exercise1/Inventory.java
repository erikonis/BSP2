import java.util.ArrayList;

public class Inventory{
    private int capacity;
    private ArrayList<Item> inventory = new ArrayList<>();
    
    public Inventory(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(Item item){
        if(inventory.size()<capacity){
            inventory.add(item);
            return true;
        }
        else{
            return false;
        }
    }

    public int drop(Item item){
        int count=0;
        for (Item i : inventory) {
            if(i.equals(item)){
                inventory.remove(i);
                count++;
            }
        }
        System.out.println("Dropped "+count+" instances of item: "+item.toString());
        return count;
    }

    public boolean drop(int index){
        if(inventory.get(index)!=null){
            inventory.remove(index);
            return true;
        }
        else{
            return false;
        }
    }

    public void use(Item item){
        if(item instanceof Consumable){
            Consumable consumable = (Consumable) item;
            consumable.use();
            if(consumable.getCharge()==0){
                System.out.println("Used item has no charges left and has been dropped: "+item.toString());
                inventory.remove(item);
            }
        }
        else{
            System.out.println("The "+item.getClass()+" item "+item.getName()+" cnnot be used.");
        }
    }

    public boolean sell(Item item){
        if(item instanceof Gear || !inventory.contains(item)){
            System.out.println("The following item cannot be sold: "+item.toString());
            return false;
        }
        else{
            System.out.println("Item sold: "+item.toString());
            return true;
        }
    }

    @Override
    public String toString() {
        String msg = "Inventory: ("+inventory.size()+")";
        for (int i = 0; i < inventory.size(); i++) {
            msg += "\n{"+i+"}"+inventory.get(i).toString();
        }
        return msg;
    }

    
}