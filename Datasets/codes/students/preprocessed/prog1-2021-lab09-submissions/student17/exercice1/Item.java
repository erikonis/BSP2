public class Item{

    private String name;
    private int value;
    Rarity rarity;

    enum Rarity{
        WHITE,
        PINK,
        GREEN,
        BLUE,
        PURPLE
    }

    Item(String name, int value, Rarity rarity){
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Rarity getRarity(){
        return rarity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((rarity == null) ? 0 : rarity.hashCode());
        result = prime * result + value;
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
