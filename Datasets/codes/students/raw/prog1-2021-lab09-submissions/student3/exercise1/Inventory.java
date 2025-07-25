package lu.uni.programming1.lab9.exercise1;

import java.util.Arrays;

public class Inventory {
    private int capacity;
    private Item[] items={};
    
    public Inventory(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(Item item){
        if(items.length >= capacity){
            System.err.println("inventory full, cannot carry any more");
            return false;
        }

        items = Arrays.copyOf(items, items.length + 1);
        items[items.length-1]=item;
        return true;
    }

    public int drop(Item item){
        int offset = 0;
        for (int i = 0; i < items.length; i++){
            if(items[i].equals(item)){
                items[i] = null;
                offset ++;
            }
            if(i<items.length-offset){
                items[i]=items[i+offset];
            }
        }
        items=Arrays.copyOf(items, items.length-offset);
        System.out.println("\nDropped " + offset + " of item " + item);
        return offset;
    }

    public boolean drop(int index){
        if(index >= items.length){
            System.err.println("this item doesn't exist (index: " + index + ")");
            return false;
        }
        items[index]= null;
		for(int i=index; i+1<items.length; i++){
			items[i]=items[i+1];
		}
		items = Arrays.copyOf(items, items.length-1);
		return true;
    }

	public void use(int index){
		if(items[index].getClass() != Consumable.class){
			System.err.println("the " + items[index].getClassName() + " item " + items[index].getName() + " could not be used" );
		}
	}

    @Override
    public String toString() {
        String contstr = "";
        for(int i = 0; i<items.length; i++){
            contstr += "\n{" + i + "} " + items[i];
        }
        return "\nInventory: (" + items.length + "/" + capacity + ")" + contstr;
    }
}
