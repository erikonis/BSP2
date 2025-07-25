public class Gear extends Items{

    private int criticalHit;
    private int determination;
    private int directHit;

    public Gear(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit){
        super(name, value, rarity);
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
    }

    public void use(){
        super.use();
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
    public String toString(){
        return "[" + getRarity() + "] " + getName() + " (" + getValue() + ") - " + 
        getCriticalHit() + " Critical Hit / " + getDetermination() + " Determination / " +
        getDirectHit() + " Direct Hit";
    }
}
