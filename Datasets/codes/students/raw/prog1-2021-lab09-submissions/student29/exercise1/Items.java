package lu.uni.programming1.lab9.exercise1;

public abstract class Items {
    private String name;
    private int value;
    private rarity rarity;

    public Items(String name_, int value_, rarity rarity_) {
        this.name = name_;
        this.value = value_;
        this.rarity = rarity_;
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

    public rarity getRarity() {
        return rarity;
    }

    public void setRarity(rarity rarity) {
        this.rarity = rarity;
    }

    

    
}
