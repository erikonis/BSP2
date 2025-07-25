package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;

public class Inventory {

    private int invCapacity;
    private ArrayList<Items> inventorylist;
    private Items items;

    public Inventory(int invCapacity){
        this.invCapacity=invCapacity;
        inventorylist = new ArrayList<>(invCapacity);
    }

	public boolean add (Items items){
        if (inventorylist.size() < invCapacity) {
            inventorylist.add(items);
            System.out.println("Added item to inventory: "+items.toString());
            return true;
        }else return false;
    }

    public int drop (Items items){
        int itemsdrop=0;
        for(int i=0;i<inventorylist.size();i++){
            if (inventorylist.get(i)!=null && inventorylist.get(i).equals(items)){
                itemsdrop++;
                inventorylist.remove(i);}
        }
        System.out.println(itemsdrop+" "+items.toString()+" has been dropped");
        return itemsdrop;
    }

    public boolean drop(int index){
        if (inventorylist.get(index)==null) {
            return false;
        }else inventorylist.remove(index);
            return true;
    }

    public void use(int index){
        if(items instanceof ConsumableItems){
            if(((ConsumableItems) items).getCharges()>0)
                ((ConsumableItems) items).use();
                System.out.println(inventorylist.get(index).getItemName()+" Potion has been used. ("+((ConsumableItems)items).getCharges()+" charges left.");
                if(((ConsumableItems) items).getCharges()==0){
                    System.out.println(inventorylist.get(index).getItemName()+"Potion has no charges left, item has been dropped.");
                    inventorylist.remove(items);
                }
        }
        else System.out.println("The gear item "+inventorylist.get(index).getItemName()+" can't be used.");;
    }

    public boolean sell(int index){
        if (inventorylist.get(index).getClass()==TrashItems.class || inventorylist.get(index).getClass()== ConsumableItems.class) {
            inventorylist.remove(index);
            System.out.println("Item sold: "+inventorylist.get(index).toString());
            return true;
        }else
            System.out.println("The following item cannot be sold: "+inventorylist.get(index).toString());
            return false;
    }

    @Override
    public String toString() {
        String inv1="";
        for (int i = 0; i < inventorylist.size(); i++) {
           inv1 += String.format("\n{%d} %s", i, inventorylist.get(i)); 
        }
        return inv1;
    }

}
