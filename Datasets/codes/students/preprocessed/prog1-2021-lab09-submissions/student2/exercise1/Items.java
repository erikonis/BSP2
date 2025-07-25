public class Items {
    
    private String itemName;
    private int itemcost;
    private Rarity rarity;
    
    public Items(String itemName, int itemcost, Rarity rarity) {
        this.itemName=itemName;
        this.itemcost=itemcost;
        this.rarity=rarity;
    }

    
    public String getItemName() {
        return itemName;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public int getItemcost() {
        return itemcost;
    }


    public void setItemcost(int itemcost) {
        this.itemcost = itemcost;
    }


    public Rarity getRarity() {
        return rarity;
    }


    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
    


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
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
        Items other = (Items) obj;
        if (itemName == null) {
            if (other.itemName != null)
                return false;
        } else if (!itemName.equals(other.itemName))
            return false;
        if (rarity != other.rarity)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Items [itemName=" + itemName + ", itemcost=" + itemcost + ", rarity=" + rarity + "]";
    }
    
    
}
