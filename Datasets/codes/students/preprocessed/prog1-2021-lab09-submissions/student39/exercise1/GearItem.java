public class GearItem extends Item{

    private String name;
    private int value, crit, determination, dh;
    private Rarity rarity;
    



    public GearItem(String name, int value, int crit, int determination, int dh, Rarity rarity){
    super (name,value,rarity);
        this.name = name;
        this.value = value;
        this.crit = crit;
        this.determination = determination;
        this.dh = dh;
        this.rarity = rarity;
    }




    public int getCrit() {
        return crit;
    }




    public void setCrit(int crit) {
        this.crit = crit;
    }




    public int getDetermination() {
        return determination;
    }




    public void setDetermination(int determination) {
        this.determination = determination;
    }




    public int getDh() {
        return dh;
    }




    public void setDh(int dh) {
        this.dh = dh;
    }

    @Override
    public void use(){
        System.out.println("The gear item " + name + " can not be used.");
    }

    @Override
    public String toString(){
        return "[" + rarity + "]" + " " + name + " (" + value + " Gold) - " + crit + " Critical Hit / " + determination + " Determination / " + dh + " Direct Hit";
    }



}
