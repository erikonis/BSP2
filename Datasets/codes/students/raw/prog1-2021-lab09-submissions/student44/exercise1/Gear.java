package lu.uni.programming1.lab9.exercise1;

public class Gear extends Items {
    
    private int criticalHit;
    private int determination;
    private int directHit;
    
    public int getCriticalHit() {
        return criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    public Gear(String name, int cost, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, cost, rarity);
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
    }

    @Override
    void use(Items item) {
        System.out.println("The gear item "+getName()+" cannot be used.");        
    }

    @Override
    public String toString() {
        return "["+getRarity()+"] " +getName()+ " ("+getCost()+" Gold) - "+ getCriticalHit()+ " Critical Hit / " + getDetermination() + " Determination / " + getDirectHit()+" Direct Hit";
                
    }
  
    
}
