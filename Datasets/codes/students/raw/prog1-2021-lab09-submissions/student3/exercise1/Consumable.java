package lu.uni.programming1.lab9.exercise1;

import lu.uni.programming1.lab9.exercise1.Starter.Rarity;

public class Consumable extends Item {
	private int charges;
	private int health;
	public String className = "Consumable";
	
	public Consumable(String name, double cost, Rarity rarity, int charges, int health) {
		super(name, cost, rarity, "Consumable");
		this.charges = charges;
		this.health = health;
	}

	public int getCharges() {
		return charges;
	}

	public int getHealth() {
		return health;
	}

	public String getClassName() {return "Consumable";}

	@Override
	public String toString() {
		return super.toString() + " - " + charges + " left / " + health+" HP restore per charge";
	}

	
}
