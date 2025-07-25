import java.util.ArrayList;
import java.util.Comparator;

public class Inventory {
    private int size;
    private ArrayList<Item> inventory = new ArrayList<>();
    public Inventory(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }

    public int size() {
        return inventory.size();
    }

    public boolean add(Item item) {
        if(inventory.size() != getSize()){
            System.out.println("Added item to inventory: " + item.toString());
            return inventory.add(item);
        }
        return false;
    }

    public int drop(Item item) {
        int counter = 0;
        for (Item item2 : inventory) {
            if(item2.equals(item)){
                inventory.remove(item2);
                counter++;
            }
        }
        System.out.println("Dropped " + counter + " instance(s) of item: " + item.toString());
        return counter;
    }

    public boolean drop(int index) {
        if(inventory.get(index) != null){
            inventory.remove(index);
            return true;
        }
        return false;
    }

    public void use(int index){
        if(inventory.get(index) instanceof ConsumableItem){
            ConsumableItem i = (ConsumableItem) inventory.get(index);
            i.use();
            if(i.getCharges() == 0){
                System.out.println("Used item has no charges left and has been dropped: " + i.toString());
                drop(index);
            }
        }
    }

    public boolean sell(int index){
        if(inventory.get(index) instanceof ConsumableItem || inventory.get(index) instanceof TrashItem){
            System.out.println("Item sold: " + inventory.get(index).toString());
            drop(index);
            return true;
        }
        System.out.println("The following item cannot be sold: " + inventory.get(index).toString());
        return false;
    }


    public void sort(Comparator<? super Item> c) {
        inventory.sort(c);
    }
    
}
