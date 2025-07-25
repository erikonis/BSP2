import java.util.Arrays;

public class Inventory {
    // capacity
    private int capacity;
    private Items[] ItemsInventory;

    public Inventory(int capacity) {
        this.capacity = capacity;
        ItemsInventory = new Items[capacity];
    }

    // drop item
    public int dropItem(Items i) {
        for (int s = 0; s < ItemsInventory.length; s++) {
            if (i == ItemsInventory[s]) {
                return s;
            }
        }
        return -1;
    }

    // add boolean
    public boolean add(Items i) {
        for (int s = 0; s < ItemsInventory.length; s++) {
            if (ItemsInventory[s] == null) {
                System.out.println("you have added a item to the inventory:" + " " + i.toString());
                ItemsInventory[s] = i;
                return true;
            }
        }
        return false;
    }

    // delete boolean
    public boolean drop(Items i) {
        for (int s = 0; s < ItemsInventory.length; s++) {
            if (ItemsInventory[s] == i) {
                System.out.println("you have droped a item of the inventory:" + " " + i.toString());
                ItemsInventory[s] = null;
                return true;
            }
        }
        return false;
    }

    // sell boolean
    public boolean sell(Items i) {
        if (!(i instanceof Gear)) {
            drop(i);
            System.out.println("you have sold a item of your inventory:" + " " + i.toString());
            return true;
        }
        return false;
    }

    // void use
    public void use(Items i) {
        for (int s = 0; s < ItemsInventory.length; s++) {
            if (ItemsInventory[s] == null) {
                System.out.println("you have droped a item of the inventory:" + " " + i.toString());
                ItemsInventory[s] = i;
            }
        }
    }

    // to string
    public String toString() {
        String Number = "Number of items left in the inventory" + " " + ItemsInventory.length;
        for (int s = 0; s < ItemsInventory.length; s++) {
            if (ItemsInventory[s] != null) {
                Number += "Inventory [ItemsInventory=" + " " + Arrays.toString(ItemsInventory) + " " + ", capacity="
                        + " " + capacity
                        + "]";
            }
        }
        return Number;
    }
}