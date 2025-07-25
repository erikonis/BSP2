package exercise1;

public class Inventory {

    private Item[] inventory;
    private int inventoryCapacity = 10;
    private int inventoryCount = 0;

    public Inventory(int inventoryCapacity){
        this.inventoryCapacity= inventoryCapacity;
        inventory = new Item[inventoryCapacity];
    }

    public Item[] getInventory(){
        return inventory;
    }

    public void sortInventory(Item[] inventory){ 
 
        int l = inventory.length;
        int lastposition = 0;
        for(int k=0;k<l-1;k++){
            if(inventory[k]==null){
                inventory[k]=inventory[k+1];
                if(lastposition<inventory.length){
                    lastposition=k+1;
                    inventory[lastposition]=null;
                }
            }
        }
    }

    public boolean add(Item item){
        if(inventoryCount != inventoryCapacity){
            inventory[inventoryCount]=item;
            inventoryCount++;
            System.out.println("Added item yo inventory: "+item+"\n");
            return true;
        }else{
            return false;
        }
    }

    public int drop(Item item){
        int removedItem = 0;
        
        for(int i=0; i<inventory.length; i++){
            if(inventory[i]!=null){
                if(inventory[i].equals(item)){
                    inventory[i]=null;
                    inventoryCount--;
                    removedItem++;
                }
            }
        }
        if(removedItem!=0){
            System.out.println("Dropped "+removedItem+" instance(s) of item: "+item+"\n");
        }
        this.sortInventory(this.inventory);
        return removedItem;
    }

    public boolean drop(int index){
        if(inventory[index]!=null){
            inventory[index]=null;
            inventoryCount--;
            this.sortInventory(this.inventory);
            return true;
        }else{
            return false;
        }
        
    }

    public void use(int index){
        if(inventory[index]==null){
            System.out.println("There is not item in this place!"+"\n");
        }else{
            Item item = inventory[index];
            item.use(inventory[index]);
            if(inventory[index] instanceof ConsumableItems){
                ConsumableItems consItem = (ConsumableItems)inventory[index];
                if(consItem.getCharges()==0){
                    inventory[index] =null;
                    inventoryCount--;
                    System.out.println("The consumable item Health Potion has no charges left."+"\n");
                    this.sortInventory(this.inventory);
                }
            }
        }
    }

    public boolean sell(int index){
        if(inventory[index].getClass()!=GearItems.class){
            System.out.println("Item sold: "+inventory[index]+"\n");
            inventory[index]=null;
            inventoryCount--;
            this.sortInventory(this.inventory);
            return true;
        }else if(inventory[index].getClass()==GearItems.class){
            System.out.println("The following item cannot be sold: "+inventory[index]+"\n");
            return false;
        }else{
            System.out.println("There is no item in this index of the inventory!");
            return false;
        }
    }

    public void setInventory(Item[] inventory){
        this.inventory=inventory;
    }
    
    public String toString(){
        /*StringBuilder sb = new StringBuilder();
        sb.append("Inventory : "+"("+inventoryCount+")");
        for(int i=0; i<inventoryCount; i++){
            sb.append(" {"+i+"} ");
            sb.append(inventory[i].getRarity()+" "+inventory[i].getName()+" "+inventory[i].getValue());
        }

        return sb.toString();*/
        String str = "Inventory : "+"("+inventoryCount+")\n";
        int i = 0;
        for (Item item : inventory) {
            if(item != null){
                //str+="Inventory : "+"("+inventoryCount+")\n"+
                //" {"+i+++"} "+item.getName()+" "+item.getRarity()+" "+item.getValue()+"\n";
                str+=" {"+i+++"} "+item+"\n";
            }else{
                str+=" Empty slot \n";
            }
        }
        return str;
    }
}
