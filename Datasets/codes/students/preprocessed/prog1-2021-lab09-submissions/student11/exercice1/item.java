public abstract class item {

    private String name;
    private int value;
    private rarity rarity;
    
    public item(String name, int value, rarity rarity) {
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

    public rarity getRarity() {
        return rarity;
    }

    public void setRarity(rarity rarity) {
        this.rarity = rarity;
    }
    
    public String toString()
    {
        String description = "";
        return description;
    }

    public void compareTo(item item)
    {
        String conclusion = "";
        if (this.value > item.getValue())
        {
            conclusion = " is better than ";
        }
        else if (this.value == item.getValue())
        {
            conclusion = " is equal to ";
        }
        else
        {
            conclusion = " is worse than ";
        }
        System.out.println(toString() + conclusion + item.toString());
    }

}
