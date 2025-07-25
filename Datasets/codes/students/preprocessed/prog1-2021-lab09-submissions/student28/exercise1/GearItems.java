public class GearItems extends Item {

    private int criticalHit;
    private int determination;
    private int directHit;


    public GearItems(String name, double cost, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, cost, rarity);
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

    @Override
    public int compareTo(Item other){
        int stats = criticalHit + determination + directHit;
        GearItems g = null;
        if(other instanceof GearItems){
            g = (GearItems)other;
        }
        int otherstats = g.criticalHit + g.determination + g.directHit;
        if((stats-otherstats)>=0 ){
            return 1;
        }
        else{
            return 2;
        }
        //I return 1 if stats of Item 1 is bigger and 2 if otherstats of Item 2 is bigger and -1 is other is not a GearItem

    }

    @Override 
    public String toString(){
        return "[" + super.getRarity() + "] " + super.getName() +" (" + super.getCost() + " Gold) - " + criticalHit + " Critical Hit / " + determination + " Determination / " + directHit + " Direct Hit" ;
    }
    
}
