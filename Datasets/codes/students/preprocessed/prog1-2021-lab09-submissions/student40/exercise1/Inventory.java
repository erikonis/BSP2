import java.util.ArrayList;

public class Inventory {
    private int capacity;
    // ArrayList instead of an Array for potential capacity increment
    ArrayList<Item> inventory;

    public Inventory(int capacity) {
        inventory = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean add(Item item) {
        if(inventory.size() <= capacity) {
            if(item instanceof Consumable) {
                for(int i=0; i< inventory.size(); i++) {
                    if(item.isEqual(inventory.get(i))) {
                        // Avoids filling inventory with several consumables that are the same
                        Consumable x = (Consumable) inventory.get(i);
                        Consumable y = (Consumable) item;
                        x.increaseCharges(y.getCharges());
                        System.out.println("Increased charges of item: " + item.toString());
                    }
                }
                if(!inventory.contains(item)){
                    inventory.add(item);
                    System.out.println("Added item to inventory: " + item.toString());
                }
            }else {
                inventory.add(item);
                System.out.println("Added item to inventory: " + item.toString());
            }
            return true;
        }
        else {
            System.out.println("Inventory is full!");
            return false;
        }
    }

    public int drop(Item item) {
        int dropped = 0;
        for(int i=0; i<inventory.size(); i++) {
            if(item instanceof Consumable) {
                if(inventory.get(i).isEqual(item)) {
                    Consumable x = (Consumable) inventory.get(i);
                    dropped = x.getCharges();
                    System.out.println("Dropped consumable: " + inventory.get(i).toString());
                    inventory.remove(i);
                }
            }
            else {
                if(inventory.get(i).isEqual(item)) {
                    dropped++;
                    System.out.println("Dropped " + dropped + " instances of item: " + inventory.get(i).toString());
                    inventory.remove(i);
                }
            }
        }
        return dropped;
    }

    public boolean drop(int index) {
        if(index < inventory.size()) {
            System.out.println("Item dropped: " + inventory.get(index).toString());
            inventory.remove(index);
            return true;
        }
        else{
            System.out.println("Item not found.");
            return false;
        }
    }

    public void use(int index) {
        if(inventory.get(index) instanceof Consumable) {
            Consumable x = (Consumable) inventory.get(index);
            x.decreaseCharges();
            if(x.getCharges() == 0) {
                System.out.println("Used item has no charges left and has been dropped: " + x.toString());
                inventory.remove(index);
            }
            else {
                inventory.get(index).use();
            }
        }
        else {
            inventory.get(index).use();
        }
    }

    public boolean sell(int index) {
        if(inventory.get(index) instanceof Gear) {
            System.out.println("The following item cannot be sold: " + inventory.get(index).toString());
            return false;
        }
        else {
            System.out.println("Item sold: " + inventory.get(index).toString());
            inventory.remove(index);
            return true;
        }
    }

    // Prints the inventory
    public void print() {
        System.out.println("Inventory: (" + inventory.size() + ")");
        int i = 0;
        for(Item item : inventory){
            System.out.println("{" + i + "} " + item.toString());
            i++;
        }
    }
}
