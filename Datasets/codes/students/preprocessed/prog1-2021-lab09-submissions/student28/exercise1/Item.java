public class Item implements Comparable<Item> {
    private String name;
    private double cost;
    private Rarity rarity;
    
    public Item(String name, double cost, Rarity rarity) {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }


    public double getCost() {
        return cost;
    }

    public Rarity getRarity() {
        return rarity;
    }
    public void use(){};
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (rarity == null) {
            if (other.rarity != null)
                return false;
        } else if (!rarity.equals(other.rarity))
            return false;
        return true;
    }
    @Override
    public int compareTo(Item other){
        int diff = 0;
        if((diff = (int)(cost-other.cost))>=0){
            return diff;
        }
        else{
            return diff;
        }
       

    }
}
