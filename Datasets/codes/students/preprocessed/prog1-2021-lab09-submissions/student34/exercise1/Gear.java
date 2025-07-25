public class Gear extends Item {

    private int criticalHit, determination, directHit;

    public Gear(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        this.name=name;
        this.value=value;
        this.rarity=rarity;
        this.criticalHit=criticalHit;
        this.determination=determination;
        this.directHit=directHit;

    }

    public int getCritical() {
        return criticalHit;
    }

    public int getDeter() {
        return determination;
    }

    public int getDirect() {
        return directHit;
    }

    @Override
    public String toString() {
        return "[" + rarity + "] " + name + " (" + value + " gold) " + " - " + criticalHit + " critical hit / " + determination + " determination / " + directHit + " direct hit"; 
    }

}
