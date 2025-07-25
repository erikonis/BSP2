package lu.uni.programming1.lab9.exercise1;

public class TrashItems extends Item{

    public TrashItems(String name, double cost, Rarity rarity) {
        super(name, cost, rarity);
    }
    @Override
    public String toString(){
        return "[" + super.getRarity() + "] "+ super.getName() +" (" + super.getCost() + " Gold)";
    }
}
