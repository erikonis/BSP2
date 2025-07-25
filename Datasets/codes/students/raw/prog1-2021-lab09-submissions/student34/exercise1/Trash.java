package lu.uni.programming1.lab9.exercise1;

public class Trash extends Item {

    public Trash(String name, int value, Rarity rarity) {
        this.name=name;
        this.value=value;
        this.rarity=rarity;

    }

    @Override
    public String toString() {
        return "[" + rarity + "] " + name + " (" + value + " gold) "; 
    }
    
}
