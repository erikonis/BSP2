import java.util.Objects;

public abstract class Item implements Comparable <Item>{

    protected String name;
    protected int value;
    protected Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
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

    @Override
    public int hashCode() {
        return Objects.hash(name,rarity);
    }

    @Override
    public boolean equals(Object object) {
        if((this.name == object)&&(this.rarity == object)){
            return true ;
        }
        else{
            return false;
        }   
    }

    @Override
    public int compareTo(Item other) {
        return Double.compare(value, other.value);
    }

    @Override
    public String toString() {
        return "["+ rarity +"]" + name + "(" + value + " Gold)";
    }
    
}
