package exercise1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {public static void main(String[] args) {
    
    TrashItems trashItem = new TrashItems("Apple",150,Rarity.Pink);
    GearItems gearItem = new GearItems("Better Helmet",250,Rarity.Purple,10,6,5);
    ConsumableItems consItem = new ConsumableItems("Mana Potion",35,Rarity.White,2);
    TrashItems trashItem2 = new TrashItems("Apple",150,Rarity.Pink);
    GearItems gearItem2 = new GearItems("Helmet",150,Rarity.Blue,7,5,3);
    ConsumableItems consItem2 = new ConsumableItems("Mana Potion",35,Rarity.White,2);
    TrashItems trashItem3 = new TrashItems("Melon",200,Rarity.Purple);
    GearItems gearItem3 = new GearItems("Helmet upgraded",250,Rarity.Pink,20,6,4);
    ConsumableItems consItem3 = new ConsumableItems("Mana Potion",35,Rarity.White,2);

    Inventory inventory = new Inventory(10);

    
    inventory.add(gearItem);
    inventory.add(consItem);
    inventory.add(trashItem);
    inventory.add(gearItem2);
    inventory.add(consItem2);
    inventory.add(trashItem2);
    inventory.add(gearItem3);
    inventory.add(consItem3);
    inventory.add(trashItem3);

    System.out.println(inventory.toString());
    
    
    inventory.drop(gearItem2);
    
    inventory.drop(0);

    inventory.use(2);
    inventory.use(2);
    inventory.use(2);
    inventory.use(1);

    inventory.sell(3);
    inventory.sell(4);

    //System.out.println(consItem.compareTo(gearItem));

    //System.out.println(gearItem.compareTo(gearItem));

    //System.out.println(gearItem.compareTo(trashItem));

    System.out.println(inventory.toString());

    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLUE = "\u001B[34m";

    Item[] listToSort=inventory.getInventory();

    Arrays.sort(listToSort, new Comparator<Item>() {
        @Override
        public int compare(Item item1, Item item2) {
            if (item1 == null && item2 == null) {
                return 0;
            }
            if (item1 == null) {
                return 1;
            }
            if (item2 == null) {
                return -1;
            }
            return item1.compareTo(item2);
        }
    });

    inventory.setInventory(listToSort);
    System.out.println(ANSI_BLUE+"Sorted inventory:\n"+inventory.toString()+ANSI_RESET);
}
    
}
