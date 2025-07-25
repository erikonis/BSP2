import java.util.*;


public class Inventory {
    //instance variables
    public static final int CAPACITY = 12;
    List<Item> inventoryList = new ArrayList<>();

    //function to add items to inventory
    public boolean add(Item item){
        if (inventoryList.size()<=CAPACITY){
            inventoryList.add(item);
            System.out.println("Added item to inventory: " + item.showStats());
            return true;
        }else {
            return false;
        }
    }

    //function to drop all instances of item from inventory

    public int drop(Item item){
        int count=0;
        while (inventoryList.remove(item)){
            count++;
        }
        System.out.println("Dropped " + count +" instances of item: " + item.showStats());
        return count;
    }

    //function to drop item from inventory by index
    public boolean drop(int index){
        if (index < inventoryList.size()){
            inventoryList.remove(index);
            return true;
        }else {
            return false;
        }
    }

    //function to use items

    public void use(int index){
        Item item = inventoryList.get(index);
        if(item instanceof  ConsumableItem){
            if (((ConsumableItem) item).charges>0){
                ((ConsumableItem) item).charges--;
                System.out.println("Used the consumble item " + item.name + ". (" + ((ConsumableItem) item).charges + " charges left)") ;
                if (((ConsumableItem) item).charges<=0){
                    System.out.println("Used item has no charges left and has been dropped: [" + item.rarity + "] " + item.name + " (" + item.value + " Gold) - 0 Charges");
                }
            }else
                System.out.println("The consumable item " + item.name + " has no charges left.");

        }
    }

    //function to sell items

    public boolean sell(int index){
        Item item = inventoryList.get(index);
        if (item instanceof TrashItem || item instanceof ConsumableItem){
            inventoryList.remove(index);
            return true;
        }else{
            GearItem itemm = (GearItem) inventoryList.get(index);
            System.out.println("The following item cannot be sold: "+ itemm.showStats());
            return false;
        }
    }


    //function to sort list by name and order

    public void sort(boolean byName,boolean ascending){
        if (byName){
            inventoryList.sort(Comparator.comparing(o -> o.name));
        }else{
            inventoryList.sort(Comparator.comparing(o -> o.value));
        }

        if (!ascending){
            Collections.reverse(inventoryList);
        }
    }

    //overriding toString function for custom output

    @Override
    public String toString() {
        System.out.println("Inventory: " + inventoryList.size());
        int c= 0;
        StringBuilder sb = new StringBuilder();
        for (Item i : inventoryList){
            sb.append("{").append(c).append("}").append(i.showStats()).append("\n");
            c++;
        }
        return sb.toString();
    }

    //main function for using the classes defined
    public static void main(String[] args) {
        ConsumableItem item1 = new ConsumableItem("Mana Potion",230,Rarity.WHITE,1);
        ConsumableItem itemc2 = new ConsumableItem("Health Potion",230,Rarity.WHITE,2);
        GearItem item2 = new GearItem("Helmet",250,Rarity.BLUE,5,3,4);
        GearItem item4 = new GearItem("Vest",290,Rarity.PURPLE,5,3,4);
        TrashItem item3 = new TrashItem("Cross",2,Rarity.PINK);



        Inventory inventory = new Inventory();
        inventory.add(item1);
        inventory.add(itemc2);
        inventory.add(item2);
        inventory.add(item4);
        inventory.add(item1);
        inventory.add(item3);

        //System.out.println(inventory);


        inventory.drop(item1);
        inventory.add(item2);
        inventory.use(0);
        inventory.use(0);
        inventory.use(0);
        inventory.use(1);

        inventory.sell(0);
        inventory.sell(3);

        inventory.sort(false,true);
    }
}
