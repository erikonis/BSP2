public class Item implements Comparable<Item>{
    private String name;
    private int cost;
    private String rarity;

    public Item(String name, int cost, String rarity) {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
    }
    
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getRarity() {
        return rarity;
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
    public int compareTo(Item item) {
        return compareTo(item);
    }

    @Override
    public String toString() {
        return "[" + rarity.toUpperCase() + "] " + name + " (" + cost + ")";
    }

    
    


}
