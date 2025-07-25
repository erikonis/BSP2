public class Launcher {

    public static void main(String[] args) {

        inventory inventory1 = new inventory(5);

      GearItem item1 = new GearItem("Helmet",150,"BLUE",1,7,1);

      GearItem item2 = new GearItem("Thundersword",450,"PURPLE",3,5,8);
      
      TrashItem item3 = new TrashItem("Garbage",1,"WHITE") ;
    
    GearItem item4 = new GearItem("Firesword",150,"BLUE",7,3,9);
    
    ConsumableItem item5 = new ConsumableItem("Health Potion",150,"BLUE",2);
        

      inventory1.addItem(item1);
      inventory1.addItem(item2);
      inventory1.addItem(item3);
      inventory1.addItem(item5);
     

     

      inventory1.printinventory();

      inventory1.dropitem(item3);
      inventory1.use(3);
      inventory1.sell(3);

      inventory1.printinventory();

      inventory1.addItem(item3);
      inventory1.use(1);
      inventory1.printinventory();
      inventory1.use(2);

        
    }
    
}
