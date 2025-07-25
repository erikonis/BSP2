public class Item {
    private String name;
    private int value;
    private Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void use() {
        System.out.println("The item " + getName() + "can not be used.");
    }

    public boolean isEqual(Item compared){
        boolean isEqual = false;
        if(this.getName().equals(compared.getName()) && this.getRarity().equals(compared.getRarity())){
            isEqual = true;
        }
        return isEqual;
    }

    public String toString() {
        return "[" + getRarity() + "] " + getName() + " (" + getValue() + " Gold) ";
    }
}
