import lu.uni.programming1.lab9.exercise1.Starter.Rarity;

public class Gear extends Item {
	private int crithit;
	private int determination;
	private int directhit;
	
	public Gear(String name, double cost, Rarity rarity, int crithit, int determination, int directhit) {
		super(name, cost, rarity, "Gear");
		this.crithit = crithit;
		this.determination = determination;
		this.directhit = directhit;
	}

	public int getCrithit() {
		return crithit;
	}

	public int getDetermination() {
		return determination;
	}

	public int getDirecthit() {
		return directhit;
	}

    @Override
    public String toString() {
		return super.toString() + " - " + crithit + " Critical hit / " + determination + " Determination / " + directhit + " Direct hit";
    }
}
