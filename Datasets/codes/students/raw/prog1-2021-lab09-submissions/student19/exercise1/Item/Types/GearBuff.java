package lu.uni.programming1.lab9.exercise1.Item.Types;

public class GearBuff {
    private int crtlHit;
    private int dertermination;
    private int dHit;

    public GearBuff(int crtlHit, int dertermination, int dHit) {
        this.crtlHit = crtlHit;
        this.dertermination = dertermination;
        this.dHit = dHit;
    }

    public int getCrtlHit() {return this.crtlHit;}
    public int getDeter() {return this.dertermination;}
    public int getDHit() {return this.crtlHit;}

    @Override
    public String toString() {
        return "Critical Hit + " + this.crtlHit + "; Determination + " + this.dertermination + "; Direct Hit + " + this.dHit;
    }
}
