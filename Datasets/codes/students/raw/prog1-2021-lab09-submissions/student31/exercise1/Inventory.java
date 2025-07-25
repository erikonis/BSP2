package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;

public class Inventory {


    // The inventory size is 20.
    private final int capacity=20; 

    ArrayList<Item> itemList = new ArrayList<>();

    boolean add(Item item) {

        if(itemList.size()!=capacity) {
        itemList.add(item); return true;  }
        else {System.out.println("The inventory is full!"); return false; }

    }



    int drop (Item item) {

        int count = 0; 

        for (Item i :  itemList) {if (i.equals(item)) {itemList.remove(item); count+=1;};}

        return count;

    }

    boolean drop (int index) {

        if (   itemList.get(index)!=null) {itemList.remove(itemList.get(index)); return true; }
        else return false;

    }

    void use (int index) {
    
    if ( (itemList.get(index))!=null ) itemList.remove(index);



    }







    }


    

