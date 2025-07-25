/**
 * Item
 */
public class Item {

    private String name;
    private int value;
    private Rarity rarity;

    public Item(String name, int value, Rarity rarity)
    {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(toString()==obj.toString()) return true;
        else return false;
        
    }

    public String toString()
    {
        return "["+rarity+"] "+name+" ("+value+" Gold) ";
    }
    public int hashcode()
    {
        return toString().hashCode();
    }

    public boolean use(){return false;}
    
    public int compareTo(Item item)
    {
        return 1;
    }
    
    public String getName(){return name;}

}