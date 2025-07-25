package lu.uni.programming1.lab9.exercise1;

public class Item implements Comparable<Item>
{
    private String name;
    private int value;
    private Color rarity;
    private int charges;

    public Item(String pName, int pValue, Color pRyrity, int pCharges)
    {
        name = pName;
        value = pValue;
        rarity  = pRyrity;
        charges = pCharges;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Color getRarity() {
        return rarity;
    }

    public int getCharges()
    {
        return charges;
    }

    public void use()
    {
        if(charges >=1)
        {
            charges--;
        }
        else
        {
            return;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((rarity == null) ? 0 : rarity.hashCode());
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
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (rarity != other.rarity)
            return false;
        return true;
    }

    @Override
    public int compareTo(Item o) {

        int result = 0;
        if(!(o instanceof GearItem))
        {
            result = getValue() - o.getValue();
        }
        return result;
    }

    public String toString()
    {
        String text = "[" + getRarity() + "] " + getName() + " (" + getValue() + " Gold)";
        return text;
    }
}