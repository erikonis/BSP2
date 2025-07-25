package lu.uni.programming1.lab9.exercise1;

import lu.uni.programming1.lab9.exercise1.Starter.Rarity;

public class Item {
	private String name;
	private double cost;
	private Rarity rarity;
	private String className = "Undefined item type";

	public Item(String name, double cost, Rarity rarity, String className) {
		this.name = name;
		this.cost = cost;
		this.rarity = rarity;
		this.className = className;
	}

	

	public String getName() {return name;}
	public double getCost() {return cost;}
	public Rarity getRarity() {return rarity;}
	public String getClassName() {return className;}



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
		if (rarity != other.rarity)
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "[" + rarity + "] " + name + " (" + cost + " Gold)";
    }

    
}
