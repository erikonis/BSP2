package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int capacity,items = 0;
    private List<Item> itemList = new ArrayList<Item>();

    public Inventory(int capacity) {
        this.capacity = capacity;
    }
    
    public boolean add(Item item) {
        if (capacity != items) {
            items += 1;
            itemList.add(item);
            System.out.printf("\nAdded item to inventory: %s", item);
            return true;
        } else {
            System.out.println("\nUnsufficient capacity! Item cannot be added!");
            return false;
        }

    }
    
    public int drop(Item item) {
        int removed = 0;
        while (itemList.contains(item)) {
            itemList.remove(item);
            items -= 1;
            removed += 1;
        }
        System.out.printf("\nRemoved %d instances of item: %s",removed,item);
        return removed;

    }

    public boolean drop(int index) {
        if (index >= itemList.size() || index < 0) {
            System.out.print("\nIndex is out of bounds!");
            return false;
        } else {
            System.out.printf("\nDropped item in position %d: %s", index,itemList.get(index));
            itemList.remove(index);
            items -= 1;
            return true;
        }

    }

    public void use(int index) {
        if (itemList.get(index).getClass() == ConsumableItem.class) {
            ((ConsumableItem)itemList.get(index)).use();
            if (((ConsumableItem)itemList.get(index)).getCharges() == 0) {
                System.out.printf("\n\nUsed item has no charges left and has been dropped: %s\n", itemList.get(index));
                ((ConsumableItem)itemList.get(index)).setCharges(2); // reset charges if we add a new consumable
                itemList.remove(index);
                items -= 1;
            }
        } else if (itemList.get(index).getClass() == GearItem.class) {
            ((GearItem)itemList.get(index)).use();
        } else if (itemList.get(index).getClass() == TrashItem.class) {
            ((TrashItem)itemList.get(index)).use();
        } // continue here if you add more objects and want to use them from the inventory

    }

    public boolean sell(int index) {
        if (itemList.get(index).getClass() == ConsumableItem.class || itemList.get(index).getClass() == TrashItem.class) {
            System.out.printf("\nItem sold: %s", itemList.get(index));
            itemList.remove(index);
            items -= 1;
            return true;
        } else if (itemList.get(index).getClass() == GearItem.class) {
            System.out.printf("\nThe following item cannot be sold: %s", itemList.get(index));
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < itemList.size(); i++) {
            result += String.format("\n{%d} %s",i,itemList.get(i));
        }
        return result;
    }

}
