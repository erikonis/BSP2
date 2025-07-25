public class Item implements Comparable<Item> {
    //instance variables
    String name;
    double value;
    Rarity rarity;


    //Constructor

    public Item(String name, double value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    //overriding equals() function to have custom equal property
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


    //overriding compareTo to have custom comparision
    @Override
    public int compareTo(Item o) {
        return Double.compare(this.value, o.value);
    }


    //function for displaying stats

    public String showStats(){
        return "[" +rarity+"] " + name  + " (" + value + " Gold) - ";
    }

}
