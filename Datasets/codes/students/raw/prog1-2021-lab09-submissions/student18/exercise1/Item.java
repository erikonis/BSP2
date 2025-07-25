package lab9.exercise1;

public abstract class Item implements Comparable<Item>{
    enum Rarity{
        WHITE, PINK, BLUE, GREEN, PURPLE;
    }

    private String name;
    private int value;
    private Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    @Override
    public String toString() {
        return "["+rarity+"] "+name+" ("+value+" Gold)";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item){
            Item other = (Item)obj;
            if(other.getName().equals(name) && other.getRarity().equals(rarity)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override
    public int compareTo(Item o) {
        if(o instanceof Gear){
            Gear thisGear = (Gear)this;
            Gear otherGear = (Gear)o;
            int sumOfHits = thisGear.getCriticalHit() + thisGear.getDetermination() + thisGear.getDirectHit();
            int otherSumOfHits = otherGear.getCriticalHit() + otherGear.getDetermination() + otherGear.getDirectHit();
            return sumOfHits-otherSumOfHits;
        }
        else{
            return value-o.getValue();
        }
    }


    

     



    


}