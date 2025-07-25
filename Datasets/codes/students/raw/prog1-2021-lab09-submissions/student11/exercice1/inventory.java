package lu.uni.programming1.lab9.exercice1;

import java.util.ArrayList;

public class inventory {

    private int inventorySize;
    private item[] item;

    

    public inventory(int inventorySize) {
        this.inventorySize =  inventorySize;
        item = new item[this.inventorySize];
    }

    public void printInventory()
    {
        int occupied = 0;
        for (int i = 0; i < item.length; i++)
        {
            if (this.item[i] != null) {occupied++;}
        }
        System.out.println("Inventory space: (" + item.length + ")");
        System.out.println("Inventory space used: (" + occupied + ")");
        for (int i = 0; i < item.length; i++)
        {  
            if (this.item[i] != null){System.out.println("{" + i + "} " + this.item[i].toString());};
        }
    }

    public boolean add(item item)
    {
        boolean notFull = false;

        for (int i = 0; i < this.item.length; i++)
        {
            if (this.item[i] == null)
            {
                this.item[i] = item;
                notFull = true;
                System.out.println("Added item to inventory: " + item.toString());
                break;
            }
        }
        if (!notFull)
        {
            System.out.println("Inventory is full.");
        }
        return notFull;
    }
    
    public int drop(item item)
    {
        int counter = 0;
        ArrayList<Integer> dropIndex = new ArrayList<Integer>(0);

        for (int i = 0; i < this.item.length; i++)
        {
            if (this.item[i] != null)
            {
                if ((this.item[i].getName().equals(item.getName())) && (this.item[i].getRarity().equals(item.getRarity())))
                {
                    counter++;
                    dropIndex.add(i);
                }
            }
        }
        if (counter == 0)
        {
            System.out.println("There is no instance of " + item.toString() + " in the inventory.");
        }
        else
        {
            System.out.println("Dropped " + counter + " instances of item: ");
            System.out.println(item.toString());
            for (int i = 0; i < dropIndex.size(); i++)
            {
                this.item[dropIndex.get(i)] = null;
            }
        }   
        return counter;
    }

    public boolean drop(int index)
    {
        boolean drop = false;

        if (this.item[index] != null)
        {
            drop = true;
            System.out.println("Item dropped: " + this.item[index].toString());
            this.item[index] = null;
        }
        else
        {
            System.out.println("This slot is already empty.");
        }

        return drop;
    }

    public boolean sell(int index)
    {
        boolean sellable = false;

        if ((this.item[index] != null) && !(this.item[index] instanceof gear))
        {
            sellable = true;
            System.out.println("Item sold: " + this.item[index].toString());
            this.item[index] = null;
        }
        else if (this.item[index] != null)
        {
            System.out.println("This item cannot be sold: " + this.item[index].toString());
        }
        else
        {
            System.out.println("This slot is empty.");
        }

        return sellable;
    }

    public void use(int index)
    {
        if (this.item[index] instanceof consumable)
        {
        ((consumable) this.item[index]).use();

            if (((consumable) this.item[index]).getCharges() == 0)
            {
                System.out.println("Used item has no charges left and has been dropped: "+ this.item[index].toString());
                this.item[index] = null;
            }
        }
        else if (this.item[index] != null)
        {
            System.out.println("Cannot use " + this.item[index].toString() + ".");
        }
        else
        {
            System.out.println("This slot is empty.");
        }
        
    }

}
