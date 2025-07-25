package lu.uni.programming1.lab9.exercise1;

public abstract class Item implements Comparable<Item> {

    protected String name;
    protected int value;
    protected Rarity rarity;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    @Override
    public boolean equals(Object a) {
        if (a==this) {
            return true;
        }

        if (a==null) {
            return false;
        }
        
        if (!(a instanceof Item)) {
            return false;
        }
        
        Item k = (Item)a;
        return (name == k.getName() &&  rarity == k.getRarity());
    }

    @Override
    public int compareTo(Item target) {
        if (this instanceof Gear && target instanceof Gear) {
            Gear thiscast = (Gear)this;
            Gear targetcast = (Gear)target;
            return (thiscast.getCritical() + thiscast.getDeter() + thiscast.getDirect()) - (targetcast.getCritical() + targetcast.getDeter() + targetcast.getDirect());
        }
        else {
            return this.getValue() - target.getValue();
        }

    }



}
