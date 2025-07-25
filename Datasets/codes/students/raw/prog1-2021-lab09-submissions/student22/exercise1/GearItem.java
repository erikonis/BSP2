package lu.uni.programming1.lab9.exercise1;

public class GearItem extends Item {
    private int critRate,determination,directHit;

    public GearItem(String name, int value, Colours rarity, int critRate, int determination, int directHit) {
        super(name, value, rarity);
        this.critRate = critRate;
        this.determination = determination;
        this.directHit = directHit;
    }

    public int getCritRate() {
        return critRate;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    public void calibrate() {
        if (critRate < 0) {
            critRate = 0;
        }
        if (determination < 0) {
            determination = 0;
        }
        if (directHit < 0) {
            directHit = 0;
        }
    }

    public void use() {
        System.out.printf("\nThe gear item %s cannot be used.",getName());
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%d Gold)",getRarity(),getName(),getValue())
        + String.format(" - %d Critical Hit", getCritRate())
        + String.format(" / %d Determination", getDetermination())
        + String.format(" / %d Direct Hit", getDirectHit());
    }
    
}
