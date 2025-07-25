package exercise1;

public class Trash extends Items {

    public Trash(String name, int cost, String rarity) {
        super(name, cost, rarity);
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    

}
