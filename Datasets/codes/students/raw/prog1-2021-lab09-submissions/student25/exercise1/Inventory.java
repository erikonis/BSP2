package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<Item> inventory;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        inventory = new ArrayList<Item>();
    }

    public boolean add(Item item) {
        if (inventory.size() != capacity) {
            inventory.add(item);
            System.out.println("Added item to inventory: " + item + "\n");
            return true;
        }
        System.out.println("No item can be added anymore, the Inventory is already full!");
        return false;
    }

    public int drop(Item item) {
        int amount = 0;

        while (inventory.remove(item)) {
            amount++;
        }

        if (amount > 1) {
            System.out.println("Dropped " + amount + " instances of item: " + item + "\n");
        } else if (amount == 1) {
            System.out.println("Dropped an instance of item: " + item);
        } else {
            System.out.println("This item cannot be dropped because there is no instance of this item.");
        }

        return amount;
    }

    public boolean drop(int index) {
        if (inventory.size() >= index+1) {
            System.out.println("Dropped an instance of the item: " + inventory.get(index));
            inventory.remove(index);
            return true;
        }
        System.out.println("This item cannot be dropped because there is no instance of this item.");
        return false;
    }

    public void use(int index) {
        if (inventory.size() >= index+1) {
            //charges is -1 if item is not a charge
            int charges = inventory.get(index).useInventory();
            
            //removes if no charges are left
            if (charges == 0) {
                System.out.println("Used item has no charges left and has been dropped: " + inventory.get(index) + "\n");
                inventory.remove(index);
            } else if (charges < 0) {
                String itemType = (inventory.get(index) instanceof GearItem) ? "gear item " : "trash item ";
                System.out.println("The " + itemType + inventory.get(index).getName() + " can not be used.\n");
            } else {
                System.out.println("Used the consumable item " + inventory.get(index).getName() + ". (" + charges + " charges left)");
            }
        }
    }

    public boolean sell(int index) {
        if (inventory.size() >= index+1) {

            // No gear items can be sold
            if (inventory.get(index) instanceof ConsumableItem || inventory.get(index) instanceof TrashItem) {
                System.out.println("Item sold: " + inventory.get(index));
                inventory.remove(index);
                return true;
            } else {
                System.out.println("The following item cannot be sold: " + inventory.get(index));
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String output = "";
        int index = 0;

        output += "Inventory: (" + inventory.size() + ")\n";

        for (Item item : inventory) {
            output += "{" + index + "} " + item.toString() + "\n";
            index++;
        }

        return output;
    }

}
