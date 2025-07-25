package lab9.exercise1;

public class Gear extends Item{
    private int criticalHit, determination, directHit;
    
    public Gear(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        this.criticalHit=criticalHit;
        this.determination=determination;
        this.directHit=directHit;
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public void setCriticalHit(int criticalHit) {
        this.criticalHit = criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    public void setDirectHit(int directHit) {
        this.directHit = directHit;
    }

    @Override
    public String toString() {
        return super.toString()+" - "+criticalHit+" Critical Hit / "+determination+" Determination / "+directHit+" Direct Hit";
    }    
}