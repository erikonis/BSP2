public class GearItem extends Item {

    private int criticalhit;
    private int determination;
    private int directhit;



    public GearItem(String name, int value, String rarity, int criticalhit, int determination, int directhit) {
        super(name, value, rarity);
        this.criticalhit = criticalhit;
        this.determination = determination;
        this.directhit = directhit;
    }



    public int getCriticalhit() {
        return criticalhit;
    }



    public int getDetermination() {
        return determination;
    }



    public int getDirecthit() {
        return directhit;
    }



 
    
}
