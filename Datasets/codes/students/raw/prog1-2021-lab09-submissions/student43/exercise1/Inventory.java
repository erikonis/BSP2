package exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    private int capacity;
    private ArrayList<Item> items = new ArrayList<>();

    public Inventory(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(Item item) {
        try{
            if (items.size() + 1 < capacity) {
            items.add(item);
            System.out.println("Added item to inventory: "+item.toString());
            return true;
        } else {
            return false;
        }
    }catch (Exception e){
        System.out.println(e.getMessage());
        return false;
    }
    }

    public int drop(Item item) {
        int counter = 0;
        Item it = item;
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).equals(item) && items.get(i).hashCode() == item.hashCode()) {
                counter++;
                items.remove(i);
            }
        }
        System.out.println("Dropped "+counter+" instances of item: "+it.toString());
        return counter;
    }

    public boolean drop(int index) {
        if (items.get(index) != null) {
            System.out.println("Dropped item: "+items.get(index).toString());
            items.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public void use(int index) {
        if (items.get(index) instanceof ConsumableItem && !((ConsumableItem) items.get(index)).checkCharges()) {
            System.out.println("Used item has no charges left and has been dropped: "+items.get(index).toString());
            items.remove(index);
        }else{
            System.out.println(items.get(index).use());
        }
    }

    public boolean sell(int index) {
        if (items.get(index) instanceof TrashItem || items.get(index) instanceof ConsumableItem) {
            System.out.println("Item sold: "+items.get(index).toString());
            items.remove(index);
            return true;
        } else {
            System.out.println("The following item cannot be sold: "+items.get(index).toString());
            return false;
        }
    }

    public void sort(String order) {
        if (order.toLowerCase().equals("ascending")) {
            Collections.sort(items);
        } else if (order.toLowerCase().equals("descending")) {
            Collections.sort(items);
            Collections.reverse(items);
        } else {
            System.out.println("Unknown operation.");
        }

    }

    public String toString() {
        String text = "";
        for (int i = 0; i < items.size(); i++) {
            text += "{" + i + "} " + items.get(i).toString() + "\n";
        }
        return text;
    }
}
