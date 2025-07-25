public class Items {
    private String name;
    private int cost;
    private String rarity;

    enum rarity{
        White,
        Pink,
        Green,
        Blue,
        Purple
    }

    public Items(String name, int cost, String rarity) {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getRarity() {
        return rarity;
    }

    public boolean isEqual(String name2, String rarity2) {
        return (name.equals(name2) && rarity.equals(rarity2));
    }

    @Override
    public String toString() {
        return "[" + rarity + "] " + name + " (" + cost + ")";
    }

}