package exercise1;

public class GearItems extends Item {

    private int criticalhit;
    private int determination;
    private int directhit;

    public GearItems(String name, int value, Rarity rarity, int criticalhit, int determination, int directhit) {
        super(name, value, rarity);
        this.setCriticalhit(criticalhit);
        this.setDetermination(determination);
        this.setDirecthit(directhit);
    }

    public int getDirecthit() {
        return directhit;
    }

    public void setDirecthit(int directhit) {
        this.directhit = directhit;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getCriticalhit() {
        return criticalhit;
    }

    public void setCriticalhit(int criticalhit) {
        this.criticalhit = criticalhit;
    }

    @Override
    public void use(Item item) {
        System.out.println("Gear item "+item.getName()+" can not be used"+"\n");
    }

    public String toString() {
        return "["+getRarity()+"] "+getName()+" ("+getValue()+
        " Gold) - "+getCriticalhit()+" Critical Hit / "+getDetermination()+" Determination / "
        +getDirecthit()+" Direct Hit";
    }

   
    public int getCompareValue() {
        return getCriticalhit()+getDetermination()+getDirecthit();
    }

}
