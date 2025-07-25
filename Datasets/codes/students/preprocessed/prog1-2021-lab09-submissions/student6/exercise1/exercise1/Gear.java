public class Gear extends Item{
    private int criticalHit;
    private int determination;
    private int directHit;
    public Gear(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        if(criticalHit>=0)
        this.criticalHit = criticalHit;
        if(determination>=0)
        this.determination = determination;
        if(directHit>=0)
        this.directHit = directHit;
    }

    public void use() {
        System.out.println("The "+ getName()+" cannot be used");
    }


    @Override
    public int compareTo(Item o) {
        if(o instanceof Gear){
            
            int sumOfStats = criticalHit+determination+directHit;
            int sumToCompare = ((Gear) o).criticalHit + ((Gear)o).determination + ((Gear)o).directHit;
            if(sumOfStats> sumToCompare)
                return 1;
            if(sumOfStats< sumToCompare)
                return -1;
            return 0;
        }
        else{
            System.err.println("Must compore Gear with Gear");
            return 0;
        }
    }

    @Override
    public String toString() {
        return  "["+super.getRarity()+"] "+super.getName()+" ("+super.getValue()+" coins) [criticalHit=" + criticalHit + ", determination=" + determination + ", directHit=" + directHit
                + "]";
    }

    
}
