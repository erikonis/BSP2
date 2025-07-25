abstract class Items {

    private String name;
    private int cost;
    private Rarity rarity;
    private int charges;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Rarity getRarity() {
        return rarity;
    }
    public int getCharges(){
        return charges;
    }

    public Items(String name, int cost, Rarity rarity) {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
    }
    abstract void use(Items item);
}
