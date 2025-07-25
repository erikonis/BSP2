package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;


public class Inventory {
    private int size=10;

    private ArrayList<Item> inventory = new ArrayList<>();

    public boolean add(Item item) //doesnt seem to be working
    {
        if(inventory.size()<size){inventory.add(item);return true;}
        else return false;
    }

    public int drop(Item item)
    {
        int count = 0;
        for(int i=inventory.size()-1;i>=0;i--)
        {
            if(inventory.get(i).equals(item)) 
            {
                count--;
                inventory.remove(i);
            }
        }
        System.out.println("Dropped "+count+" instances of item : "+item.toString());
        return count;
    }
 
    public boolean drop(int index)
    {
        if(index<inventory.size()&&inventory.get(index)!=null)
        {
            System.out.println("The item "+inventory.get(index).toString()+" was dropped.");
            inventory.remove(index);
            return true;
        }
        else return false;
    }

    public void use(int index)
    {
        if(inventory.get(index) instanceof Consumable && inventory.get(index).use()==false)
        {
            inventory.get(index).use();
            inventory.remove(index);
        }
    }

    public boolean sell(int index)
    {
        Item item = inventory.get(index);
        if(item instanceof Trash||item instanceof Consumable) 
        {
            System.out.println("Item sold: "+item.toString());
            inventory.remove(index);
            return true;
        }
        else return false;
    }

    public String toString()
    {
        String output="Inventory: ("+inventory.size()+")";
        for(int i=0; i<inventory.size();i++)
        {
            output+="\n{"+i+"}"+inventory.get(i).toString();
        }
        return output;
    }
}
