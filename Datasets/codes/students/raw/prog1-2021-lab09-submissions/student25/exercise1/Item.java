package lu.uni.programming1.lab9.exercise1;

public class Item {
    
    private String name;
    private int value;
    private Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public int use() {
        return -1;
    }

    public int useInventory() {
        return -1;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    @Override
    public int hashCode() {
        return name.hashCode() | value | rarity.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Item other = (Item) obj;
        return name == other.name && rarity == other.rarity;
    }

    @Override
    public String toString() {
        return "[" + getRarity() + "] " + getName() + " (" + getValue() + " Gold)";
    }

}
