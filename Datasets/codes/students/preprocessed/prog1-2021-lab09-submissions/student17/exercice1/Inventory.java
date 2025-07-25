import java.util.ArrayList;

public class Inventory {
    private int maxinventory;
    ArrayList<Item> inventory = new ArrayList<Item>();

    public Inventory(int maxinventory) {
        this.maxinventory = maxinventory;
    }

    boolean add(Item item) {
        if (inventory.size() <= maxinventory) {
            inventory.add(item);
            System.out.printf("\nAdded item to inventory: %s", item);
            return true;
        } else {
            System.out.println("\nThe inventory is full");
            return false;
        }

    }

    int drop(Item item) {
        int counter = 0;
        while(inventory.contains(item)){
            inventory.remove(item);
            counter++;
        }
        System.out.printf("\nDropped %d instance(s) of item: %s" , counter , item);
        return counter;
    }

    boolean drop(int index) {
        if (inventory.contains(inventory.get(index))) {
            System.out.printf("\nDropped item: %s", inventory.get(index));
            inventory.remove(inventory.get(index));
            return true;

        } else {
            return false;
        }
    }

    void use(int index) {
        ((Consumable) inventory.get(index)).setCharges(((Consumable) inventory.get(index)).getCharges() - 1);
        if (((Consumable) inventory.get(index)).getCharges() == 0) {
            System.out.printf("\nUsed item has no charges left and has been dropped: %s", inventory.get(index));
            inventory.remove(inventory.get(index));

        }
    }

    boolean sell(int index) {
        if (inventory.get(index).getClass() == Gear.class) {
            System.out.printf("\nThe following item cannot be sold: %s", inventory.get(index));
            return false;
        } else {
            System.out.printf("\nItem sold: %s\n", inventory.get(index));
            inventory.remove(inventory.get(index));
            return true;
        }
    }

    @Override
    public String toString() {
        int counter = 0;
        String output = "";
        for (Item item : inventory) {
            output += String.format("\n{%d} %s", counter, item);
            counter++;
        }
        return output;
    }
}
