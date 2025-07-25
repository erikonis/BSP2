package lu.uni.programming1.lab9.exercise1;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    static List<Items> inventory = new LinkedList<Items>();
    static Actions actions = new Actions();
    static int index;
    static Items item;

    public static boolean Add(Items item){
        inventory.add(item);
            return true;
    }

    public static int Drop(Items item){
        if(!item.drop){
            System.out.println("There is nothing in your inventory yet...");
        }
        else {inventory.remove(item);
        }
        return index;
    }

    public static boolean Drop(int index){
        inventory.remove(index);
        return true;
    }

    public static void Use(int index){
        if(Inventory.inventory.get(index).getType().equals(Types.TRASH) || Inventory.inventory.get(index).getType().equals(Types.GEAR)) {
            System.out.println("You can't use "+ inventory.get(index).getName());
        }
        else
        System.out.println("You used " + Inventory.inventory.get(index).getName());
    }

    public static boolean Sell(int index){
        if(Inventory.inventory.get(index).getType().equals(Types.GEAR)){
            System.out.println("You can't sell "+ inventory.get(index).getName());
        }
        else {System.out.println("the sold item is " + Inventory.inventory.get(index).getName() + "and the total is"+ item.getGold()+ " golds.");
            inventory.remove(index);
        }
        return true;
    }

    public static List<Items> getInventory() {
        return inventory;
    }
}
