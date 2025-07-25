package lu.uni.programming1.lab9.exercise1;

public class ItemGear extends Item {

    private int criticalHit=0;
    private int determination=0;
    private int directHit=0;

    public ItemGear(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
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

    public int sum(){
        return getCriticalHit()+getDirectHit()+getDetermination();
    }

    @Override
    public int compareTo(Item other) {
        if (other instanceof ItemGear){
            return Double.compare(this.sum(), ((ItemGear) other).sum());
        }else{
            return super.compareTo(other);
        }
    }

    @Override
    public String toString() {
        return "["+ rarity +"]" + name + "(" + value + " Gold) - " + criticalHit + " Critical Hit / "+ determination +" Determination / "+ directHit +" Direct Hit" ;
    }
    
    
}
