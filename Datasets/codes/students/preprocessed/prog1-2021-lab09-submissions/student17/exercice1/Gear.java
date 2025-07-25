public class Gear extends Item{
    
    int criticalhit;
    int determination;
    int directhit;

    Gear(String name, int value, int criticalhit, int determination, int directhit, Rarity rarity) {
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
    void use(){
        System.out.printf("The gear item %s can not be used.\n" , getName());;
    }
    @Override
    public String toString() {
        return String.format("[%s]", getRarity())
        + String.format(" %s ", getName())
        + String.format(" (%s) Gold ", getValue())
        + String.format(" (%d) Critical Hit / ", getCriticalhit())
        + String.format(" (%d) Determination / ", getDetermination())
        + String.format(" (%d) Direct Hit / ", getDirecthit());
    }
}
