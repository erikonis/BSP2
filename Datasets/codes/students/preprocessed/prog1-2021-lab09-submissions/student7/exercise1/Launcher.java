public class Launcher {
    public static void main(String[] args) {
        Inventory.Add(item1);Inventory.Add(item2);Inventory.Add(item3);Inventory.Add(item4);Inventory.Add(item5);Inventory.Add(item6);
        try {
            printInventory();
            System.out.println("\n");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }finally{
            for (int i = 0;i <4; i++){
                actions.newAction();
            }
        }
    }
    static Items item1 = new Items("Healing Apple " , Rarity.WHITE,Types.TRASH,0,0,0,25,false,false,10);

    static Items item2 = new Items("Hermes Shoes ",Rarity.PURPLE,Types.GEAR,15,0,100,1000,false,false,1);

    static Items item3 = new Items("Red Fang ",Rarity.BLUE,Types.GEAR,10,75,35,600,false,false,1);

    static Items item4 = new Items("Tent ",Rarity.PINK,Types.TRASH,0,0,0,250,false,false,1);

    static Items item5 = new Items("Bread ",Rarity.WHITE,Types.TRASH,0,0,0,5,false,false,14);

    static Items item6 = new Items("Sword ",Rarity.GREEN,Types.GEAR,80,0,10,500,false,false,1);


    static Actions actions = new Actions();
    
    public static void printInventory() {
        int totalSize = item1.getQuantity() +item2.getQuantity() +item3.getQuantity() +item4.getQuantity() +item5.getQuantity() +item6.getQuantity();
        System.out.println("The inventory contains: "+ totalSize+ "\n");
        Items.showItem(item1);Items.showItem(item2);Items.showItem(item3);Items.showItem(item4);Items.showItem(item5);Items.showItem(item6);
    }
}
