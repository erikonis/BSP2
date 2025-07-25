public class items {
    String name;
    double cost;
    rarity rarity;
    types types;
    int critical_hit;
    int determination;
    int direct_hit;

    items(String name, double cost, rarity rarity, types types,
            int critical_hit, int determination, int direct_hit) {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
        this.types = types;
        this.critical_hit = critical_hit;
        this.determination = determination;
        this.direct_hit = direct_hit;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public rarity getRarity() {
        return rarity;
    }

    public types getTypes() {
        return types;
    }

    public int getCritical_hit() {
        return critical_hit;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirect_hit() {
        return direct_hit;
    }
}
