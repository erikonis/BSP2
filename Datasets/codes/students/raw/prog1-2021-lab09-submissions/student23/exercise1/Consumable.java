package exercise1;

public class Consumable extends Items {
    private int uses;

    public Consumable(String name, int cost, String rarity, int uses) {
        super(name, cost, rarity);
        this.uses = Math.max(1, uses);
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + uses + " charges\n";
    }

}
