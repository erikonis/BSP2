import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    private ArrayList<Item> items;
    private int itemsCounter = 0;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean add(Item item) {
        if (itemsCounter++ < capacity) {
            items.add(item);
            System.out.printf("Added item to inventory: %s\n", item);
            return true;
        } else {
            System.out.println("Invetory is full");
            return false;
        }
    }

    public int drop(Item item) {
        int removedItems = 0;
        while (items.contains(item)) {

            items.remove(item);
            itemsCounter--;
            removedItems++;

        }

        System.out.printf("Dropped %d instances of item: %s\n", removedItems, item);
        return removedItems;
    }

    public boolean drop(int index) {
        if (index < itemsCounter - 1) {
            System.out.printf("Dropped item: %s\n", items.get(index));
            items.remove(index);
            itemsCounter--;
            return true;
        } else {
            System.out.println("Item does not exist");
            return false;
        }

    }

    public void use(int index) {
        Item item = items.get(index);
        item.use();
        if (item instanceof Usable) {
            Usable u = (Usable) item;
            if (u.getCharges() == 0) {
                items.remove(index);
                itemsCounter--;
                System.out.printf("Used item has no charges left and has been dropped: %s\n", item);
            }
        }
    }

    public boolean sell(int index) {
        Item item = items.get(index);
        if (item instanceof Sellable) {
            System.out.printf("Item sold: %s\n", item);
            items.remove(index);
            itemsCounter--;
            return true;
        } else {
            System.out.printf("The following item cannot be sold: %s\n", item);
            return false;
        }

    }

    public void sort(boolean name, boolean ascending) {
        if (name) {
            if (ascending) {
                Collections.sort(items, new NameComparator());
            } else {
                Collections.sort(items, new NameComparator());
                Collections.sort(items, Collections.reverseOrder());
            }
        } else {
            if (ascending) {
                Collections.sort(items, new ValueComparator());
            } else {
                Collections.sort(items, new ValueComparator());
                Collections.sort(items, Collections.reverseOrder());
            }
        }
    }

}
