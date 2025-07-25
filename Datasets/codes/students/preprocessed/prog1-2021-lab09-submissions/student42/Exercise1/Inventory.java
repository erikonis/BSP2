import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    private int capacity;
    private ArrayList<Item> items;

    public Inventory(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public boolean add(Item item)
    { if(items.size()<capacity)
        {items.add(item);
            System.out.println("Added item to inventory: "+item+"\n");
            return true;}
    else
    {System.err.println("Cannot add "+item+"! Inventory full!\n");
    return false;
    }
}

    public int drop(Item item)
    {int i=0,n=0;
    while(i<items.size()-1)
    {if(items.get(i).equals(item))
        {items.remove(i);
        n++;
        i--;
    }
    i++;}
    if(n>0) System.out.println("Dropped all ("+n+") instances of item: "+item+"\n");
    return n;
    }

    public boolean drop (int index)
    {if(index<items.size())
        {
            System.out.println("Dropped one instance of "+items.get(index)+"\n");
            items.remove(index);
            
            return true;
        }
     return false;}
      
    public void use(int index)
    {   if(index<items.size())
        {if(items.get(index) instanceof ConsumableItem)
        {ConsumableItem ci = (ConsumableItem) items.get(index);
        ci.use();
        System.out.println("Used the consumable item "+ci.getName()+"("+ci.getCharges()+" charges left)");
        if(ci.getCharges()==0)
        {System.out.println("The consumable item used has no charges left and has been dropped: "+ci+"\n");
        items.remove(index);}}
        else
        {if(items.get(index) instanceof GearItem)
        System.err.print("The gear item ");
        else  System.err.print("The trash item ");
        System.err.println(items.get(index).getName()+" cannot be used.");}
    }}


    public boolean sell(int index)
    { if(index<items.size()){
        if(items.get(index) instanceof GearItem)
        {System.err.println("The following item cannot be sold: "+items.get(index));
        return false;}
        else 
    {System.out.println("Item sold: "+ items.get(index));
        items.remove(index);}}
        return true;
    }

    public void sort(Comparison compare)
    { items.sort(compare.getComparator());
        if(compare.getOrder()=="descending")
        Collections.reverse(items);
        System.out.println("Inventory sorted by "+ compare.getCriteria()+" in "+ compare.getOrder()+ " order.");

    }

    @Override
    public String toString() {
        String ims="Inventory: ("+items.size()+")\n";
        int i=0;
        for(Item item : items)
        ims=ims+"{"+i++ +"} "+item+"\n";
        return ims;
    }


    
    }


