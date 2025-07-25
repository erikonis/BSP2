import java.util.ArrayList;
import java.util.Collections;

public class Inventory {

    private ArrayList<Item> itemList = new ArrayList<>();
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(Item item) {
        if (capacity > itemList.size()) {
            return itemList.add(item);
        }
        System.out.println("Added item to invntory: " + item.toString());
        return false;
    }

    public int drop(Item item) {
        int counter = 0;
        for (int i = itemList.size()-1; i >=0; i--) {
            if (itemList.get(i).equals(item)) {
                itemList.remove(i);
                counter++;
            }
        }
        System.out.println("Dropped " + counter + " instances of item: " + item.toString());
        return counter;
    }

    public boolean remove(int index) {
        return itemList.remove(index) != null;
    }

    public void use(int i) {
        if(i>=0 && i<itemList.size())
        {
            if (itemList.get(i) instanceof ConsumableItem) {
                ConsumableItem item= (ConsumableItem) itemList.get(i);
                if(item.getCharge()>0)
                {
                    item.setCharge(item.getCharge()-1);  
                    System.out.println("Used item has " + item.getCharge() + " charges left: " + item.toString());        
                }
                else
                {
                    itemList.remove(itemList.get(i));
                    System.out.println("Used item has no charges left and has been dropped: " + item.toString());
                }
            }
            else {
                itemList.get(i).use();
            }
        }
    }

    public boolean sell(int index) {
        return itemList.get(index) instanceof ConsumableItem || itemList.get(index) instanceof GearItem;
    }

    public void sort()
    {
        Collections.sort(itemList);
    }

    public void reverseSort()
    {
        Collections.reverse(itemList);
    }

    @Override
    public String toString() {
        int counter = 0;
        String printItems = "";
        for (int i = 0; i < itemList.size(); i++) {
            printItems += "{" + i + "} " + itemList.get(i) + "\n";
            counter++;
        }
        return "Inventory: (" + counter + ")\n" + printItems;
    }

}
