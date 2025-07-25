public class Gear extends Item {
    private int criticalHit;
    private int determination;
    private int directHit;

    public Gear() {

    }

    public Gear(Rarity rarity, String name, int value, int criticalHit, int determination, int directHit) {
        super(rarity, name, value);
        this.criticalHit=criticalHit;
        this.determination=determination;
        this.directHit=directHit;
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
    public void use(){
        System.out.println("The gear item "+name+" can not be used.");
    }
    @Override
    public String toString() {
        return "["+rarity+"] "+name+" ("+value+" Gold) - " + criticalHit + " Critical Hit / " 
        + determination + " Determination / " + directHit +" Direct Hit";
    }
    
    
    
    
}
