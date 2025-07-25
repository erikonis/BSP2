public class Item {
    private String name;
    private int value;
    private Rarity rarity;
    protected int charges;

    public Item(String name, int value, Rarity rarity, int charges) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
        this.charges = charges;
    }

    public String getName() {
        return this.name;
    }
    public int getValue() {
        return this.value;
    }
    public Rarity getRarity() {
        return this.rarity;
    }
    
    public int getCharges() {
        return this.charges;
    }

    @Override
    public String toString() {
        return this.name + ":\n\tRarity : " + this.rarity.getString() + "\n\tValue : " + this.value + "\n\tCharges left : " + this.charges;
    }

    public String use() {
        return "Used one charges of '" + this.name + "'.";
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

    
}
