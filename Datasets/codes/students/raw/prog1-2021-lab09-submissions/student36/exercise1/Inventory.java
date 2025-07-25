package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;

public class Inventory {

    private int fixedcapacity = 10;

    ArrayList<Item> inventory = new ArrayList<Item>();

    public boolean add(Item item) {
        if (inventory.size() <= fixedcapacity) {
            inventory.add(item);
            System.out.println("Added item to inventory: "+item);
            return true;
        }else{
            System.out.println("No more space in your inventory");
            return false;
        }
    }

    public int drop(Item item) {
        int n = 0;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i) == item) {
                inventory.remove(i);
                n++;
            }
        }
        System.out.println("\nDropped " + n + " instances of item: "+item);
        return n;
    }

    public boolean drop(int index) {
        if (inventory.get(index) != null) {
            System.out.println("\nThe following item has been droped: "+ (Item) inventory.get(index));
            inventory.remove(index);
            return true;
        } else {
            return false;
        }

    }

    public void use(int index){
        if (inventory.get(index) instanceof ItemConsumable){
            int charges=((ItemConsumable) inventory.get(index)).getCharges();
            if (charges>1){
                ((ItemConsumable) inventory.get(index)).setCharges(--charges);
                System.out.println("\nUse the consumable "+(inventory.get(index)).getName()+ " ("+ charges +" charges left)");
                return;
            }else if(charges==1){
                ((ItemConsumable) inventory.get(index)).setCharges(--charges);
                System.out.println("\nUse the consumable "+(inventory.get(index)).getName()+" (0 charges left)"
                +"\nThe consumable item "+  (inventory.get(index)).getName() +" has no charges left."
                +"\nUsed item has no charges left and has been dropped: "+ (inventory.get(index)));
                inventory.remove(index);
                return;
            }else{
                System.out.println("The consumable item was not found: "+ (inventory.get(index)).getName());    
            }
        }if(inventory.get(index) instanceof ItemGear){
            System.out.println("The gear item "+ (inventory.get(index)).getName() + " cannot be used right now.");
        }else{
            System.out.println("It's not a consumable/gear item !");
        }
    }

    public boolean sell(int index){
        if(inventory.get(index) instanceof Sellable){
            System.out.println("\nItem sold: "+ inventory.get(index));
            inventory.remove(index);
            return true;
        }
        else{
            System.out.println("\nThe following item cannot be sold: "+inventory.get(index));
            return false;
        }
    }

    public void comparaison(Item item, Item item2){
        switch(item.compareTo(item2)){
            case 1 : System.out.println("\nThe "+item.getName()+" has more value than "+item2.getName());
                break;
            case 0 : System.out.println("\nThe "+item.getName()+" has the same value than "+item2.getName());
                break;
            case -1 : System.out.println("\nThe "+item.getName()+" has less value than "+item2.getName());
                break;
        }
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < inventory.size(); i++) {
            string += String.format("\n{%d} %s",i,inventory.get(i));
        }
        return "\nThe inventory: ("+ inventory.size() +")"+ string +"\n";
    }

}
