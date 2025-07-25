public class Inventory {
    private int capacity;
    private Item[] inventory;

    public Inventory(int pC)
    {
        capacity = pC;
        inventory = new Item[capacity];
    }

    public int getCapacity()
    {
        return capacity;
    }

    public boolean add(Item item)
    {
        for (int i = 0; i < inventory.length; i++)
        {
            if(inventory[i] == null)
            {
                inventory[i] = item;
                System.out.println("Added item to inventory: " + item.toString());
                return true;
            }
        }
        return false;
    }

    public int drop(Item item)
    {
        int counter =0;

        for (int i = 0; i < inventory.length; i++)
        {
            if(inventory[i] != null && inventory[i].equals(item))
            {
                inventory[i] = null;
                counter++;
            }
        }
        for (int i = 0; i < inventory.length; i++)
        {
            if(i != 0 && inventory[i-1] == null)
            {
                Item tmp = inventory[i-1];
                inventory[i-1] = inventory[i];
                inventory[i] = tmp;
            }
        }
        System.out.println("Dropped " + counter + " instances of Item: " + item.toString());
        return counter;
    }

    public boolean drop(int index)
    {
        if(inventory[index] != null && inventory[index].getCharges() > 0)
        {
            System.out.println("Used Item has no charges left and has been dropped: " + inventory[index].toString());
            inventory[index] = null;
            return true;
        }
        return false;
    }

    public void use(int index)
    {
            if(inventory[index] != null && inventory[index] instanceof ConsumableItem)
            {
                if(inventory[index].getCharges() <=0)
                {
                    drop(index);
                    return;
                }
                inventory[index].use();
                System.out.println("Used the consumable item " + inventory[index].getName() + ". (" + inventory[index].getCharges() + " charges left)");
                if(inventory[index].getCharges() == 0)
                {
                    System.out.println("The consumable Item " + inventory[index].getName() + " has no charges left.");
                }
                return;
            }
            else
            {
                System.out.println("The gear Item " + inventory[index].getName() + " can  not be used");
            }
    }

    public boolean sell(int index)
    {
        if(inventory[index] instanceof ConsumableItem
        || inventory[index] instanceof TrashItem)
        {
            System.out.println("Item sold: " + inventory[index].toString());
            drop(index);
            return true;
        }
        System.out.println("The following Item cannot be sold: " + inventory[index].toString());
        return false;
    }

    public void sortByValue(boolean desc)
    {
        int index =0;

        if(desc)
        {
            for (int i = 1; i < inventory.length; i++)
            {
                if(inventory[i].getValue() > inventory[index].getValue())
                {
                    Item tmp = inventory[i];
                    inventory[i] = inventory[index];
                    inventory[index] = tmp;
                    index = i;
                }
            }
            return;
        }
        for (int i = inventory.length; i > 1; i--)
        {
            if(inventory[i].getValue() > inventory[index].getValue())
            {
                Item tmp = inventory[i];
                inventory[i] = inventory[index];
                inventory[index] = tmp;
                index = i;
            }
        }
    }

    public String toString()
    {
        String text = "Inventory: (" + inventory.length + ")";

        for (int i = 0; i < inventory.length; i++) {
            if(inventory[i] != null)
            {
                text += "\n{" + i + "} " + inventory[i].toString();
            }
        }
        return text;
    }
}