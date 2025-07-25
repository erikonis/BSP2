public class Starter {
	public static void main(String[] args) {
		Character c1 = new Character("Zelda", 100);
		Character c2 = new Character("Gannon", 300);
		Targetable t1 = new Targetable("arrow of light", c1, c2, 58);
		Targetable t2 = new Targetable("fireball", c2, c1, 27);
		Jump j1 = new Jump(c2);
		Ability a1 = new Ability("sing mario beat", c1);

		System.out.println("\n");
		t1.execute();
		t2.execute();
		j1.execute();
		a1.execute();
		t1.execute();
		t2.execute();
		t1.execute();
		t2.execute();
		t1.execute();
		t2.execute();
		t1.execute();
		t2.execute();

		Logs.printLogs();

	}
}
