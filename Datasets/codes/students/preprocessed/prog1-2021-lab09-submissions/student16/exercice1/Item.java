public abstract class Item {

    private String name;
    private int value;
    private String rarity;
    private int charges;
    private int criticalhit;
    private int determination;
    private int directhit;

    
    
    public Item(String name, int value, String rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
        
    }


    public String getName() {
        return name;
    }




    public int getValue() {
        return value;
    }



    public String getRarity() {
        return rarity;
    }



    public int getCharges() {
        return charges;
    }


    public void setCharges(int charges) {
        this.charges = charges;
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


    public char[] showItem(int i) {
        return null;
    }
    
}
