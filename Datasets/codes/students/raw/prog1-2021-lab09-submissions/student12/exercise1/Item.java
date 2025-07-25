package exercise1;

public abstract class Item implements Comparable<Item> {
    
    private String name;
    private int value;
    private Rarity rarity; 
    
    public Item(String name, int value, Rarity rarity) {
        this.setName(name);
        this.setValue(value);
        this.setRarity(rarity);
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((rarity == null) ? 0 : rarity.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        return other.getName().equals(name) && other.getRarity().equals(rarity);
    }

    public abstract void use(Item item);

    public Rarity getRarity() {
        return this.rarity;
    }

    @Override
    public int compareTo(Item item) {
        if(item==null){
            return -1;
        }
        if(this instanceof GearItems && item instanceof GearItems){
            GearItems gearItem = (GearItems) item;
            GearItems gearItem2 = (GearItems)this;
            if(gearItem.getCompareValue()==gearItem2.getCompareValue()){
                return 0;
            }else if(gearItem.getCompareValue()>gearItem2.getCompareValue()){
                return +1;
            }else{
                return -1;
            }
        }
        else if(item.getValue()==this.getValue()){
            return 0;
        }else if(item.getValue()>this.getValue()){
            return +1;
        }else{
            return -1;
        }
    }

    public void setRarity(Rarity rarity) {
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

    public void setName(String name) {
        this.name = name;
    }
}
