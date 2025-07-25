public abstract class Items{

    protected String name;
    protected int value;
    Rarity rarity;
    protected String text = "";
    

    public Items(String name, int value, Rarity rarity){
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }
    
    public void use(){
        
    }

    public int getCriticalHit(){
        return 0;
    }

    public int getDetermination(){
        return 0;
    }

    public int getDirectHit(){
        return 0;
    }

    public int getCharge(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public String toString(){
        return text;
    }
}