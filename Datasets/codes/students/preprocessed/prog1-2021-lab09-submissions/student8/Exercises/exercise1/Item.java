
public class Item implements Comparable<Item>{
    private String name;
    private int value;
    private rarity itemrarity;

    enum rarity 
    {
        White,Pink,Green,Blue,Purple
    }
    

    public Item(String name, int value, String itemrarity) {
        this.name = name;
        this.value = value;
        switch(itemrarity)
        {
            case "White":
            this.itemrarity=rarity.White;
            break;
            case "Pink":
            this.itemrarity=rarity.Pink;
            break;
            case "Green":
            this.itemrarity=rarity.Green;
            break;
            case "Blue":
            this.itemrarity=rarity.Blue;
            break;
            case "Purple":
            this.itemrarity=rarity.Purple;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((itemrarity == null) ? 0 : itemrarity.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (itemrarity != other.itemrarity)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public boolean use()
    {
        return true;
    }

    @Override
    public int compareTo(Item item)
    {
       return value-item.value;
    }

    public String getName()
    {
        return name;
    }
    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        return "["+itemrarity.name()+"] "+name+" ("+value+" Gold)";
    }
    
    
    
}
