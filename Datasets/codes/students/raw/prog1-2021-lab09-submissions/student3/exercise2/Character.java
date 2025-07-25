package lu.uni.programming1.lab9.exercise2;

public class Character {
	private String name;
	private int maxHealth;
	private int currHealth;
	
	public Character(String name, int maxHealth) {
		this.name = name;
		this.maxHealth = this.currHealth = maxHealth;
	}

	public String getName() {
		return name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getCurrHealth() {
		return currHealth;
	}

	public void setCurrHealth(int currHealth) {
		this.currHealth = currHealth;
	}

	@Override
	public String toString() {
		return this.name + "(" + currHealth + "/" + maxHealth + ")";
	}

	
}
