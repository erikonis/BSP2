package exercise1;
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
        System.out.println(getName()+" was equipped: "+criticalHit+"/"+determination+"/"+directHit);
    }
}
