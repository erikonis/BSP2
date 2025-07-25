
public class Item implements Comparable<Item> {
    String name;
    double value;
    Rarity rarity;

    public Item(String name, double value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Item)){
            return false;
        }

        Item c = (Item) obj;

        return c.name.equals(name)&&c.rarity.equals(rarity);
    }

    public void use(){

    }


    @Override
    public int compareTo(Item o) {
        return Double.compare(this.value, o.value);
    }

    public String showStats(){
        return "[" +rarity+"] " + name  + " (" + value + " Gold) - ";
    }

}
