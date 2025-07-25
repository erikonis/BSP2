package lu.uni.programming1.lab9.exercise1;

public class Launcher {

    public static void main(String[] args) {

        Consumable c1 = new Consumable(Rarity.WHITE, "health potion",50,5);
        Consumable c2 = new Consumable(Rarity.PINK, "elixir of Iron",100,2);
        Consumable c3 = new Consumable(Rarity.BLUE, "elixir of Sorcery",250,1);
        Consumable c4 = new Consumable(Rarity.PINK, "elixir of Wrath",100,2);

        Gear g1 = new Gear(Rarity.WHITE, "Calibrum", 100, 50, 5, 6);

        Trash t1 = new Trash(Rarity.WHITE, "basurita", 10);

        System.out.println(c1);
        System.out.println(g1);
        System.out.println(t1);

        Inventory inv = new Inventory(15);
       
        inv.add(c1);
        inv.add(g1);
        inv.add(t1);
        inv.use(0);
        inv.use(2);

        
    }
    
}
