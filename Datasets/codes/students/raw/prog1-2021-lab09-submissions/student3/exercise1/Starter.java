package lu.uni.programming1.lab9.exercise1;

public class Starter {
	public enum Rarity{
		White,
		Pink,
		Green,
		Blue,
		Purple;
	}

	public static void main(String[] args) {
		Trash i1 = new Trash("empty bottle", 0, Rarity.White);
		Gear i2 = new Gear("Iron sword", 25, Rarity.Pink, 29, 15, 18);
		Consumable i3 = new Consumable("magic potion", 13.5, Rarity.Pink, 3, 56);
        Inventory inv = new Inventory(5);

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
        inv.add(i1);
        inv.add(i2);
        inv.add(i3);
        inv.add(i3);
        System.out.println(inv);
        inv.drop(i3);
		// inv.drop(2);
        System.out.println(inv);
		inv.use(1);

	}
	
}
