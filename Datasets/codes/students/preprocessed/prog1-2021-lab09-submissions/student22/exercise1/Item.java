public abstract class Item {
    private String name;
    private int value;
    private Colours rarity;

    public Item(String name, int value, Colours rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public Colours getRarity() {
        return rarity;
    }

    public int getValue() {
        return value;
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
        Item other = (Item) obj;
        if (!name.equals(other.name))
            return false;
        if (!rarity.equals(other.rarity))
            return false;
        return true;
    }
    
    
}
