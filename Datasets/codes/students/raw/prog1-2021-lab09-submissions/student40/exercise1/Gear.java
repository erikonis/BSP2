package lu.uni.programming1.lab9.exercise1;

public class Gear extends Item {
    private int criticalHit;
    private int determination;
    private int directHit;

    public Gear(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name,value,rarity);
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirectHit() {
        return directHit;
    }
    
    @Override
    public void use() {
        System.out.println("The gear item " + getName() + " can not be used.");
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getCriticalHit() + " Critical Hit / " + getDetermination() + " Determination / " + getDirectHit() + " Direct Hit";
    }
}
