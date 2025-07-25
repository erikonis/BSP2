package lu.uni.programming1.lab9.exercise1;

public class Main {

    public static void main(String[] args) {
        Rarity white = Rarity.WHITE;
        //Rarity pink = Rarity.PINK;
        //Rarity green = Rarity.GREEN;
        Rarity blue = Rarity.BLUE;
        Rarity purple = Rarity.PURPLE;

        Inventory inv = new Inventory(5);

        Items helmet = new Trash("Stone", 20, white);
        Items health = new Consumable("Health Potion", 50, purple, 1);
        Items sword = new Gear("Qama", 200, blue, 12, 8, 10);

        inv.add(sword);
        inv.add(health);
        inv.add(helmet);
        inv.add(sword);
        inv.add(helmet); //inventory containts 5 items by this point
        inv.sell(5); //wont work, index out of boundaries
        inv.drop(sword); // removes both instances of sword, new inventory has 3 items
        inv.drop(1); //removes second item, which is in this case 1 instance of Stone
        inv.use(0); //uses Health Portion, so 0 charges left
        inv.use(0); //Since Health Portion has 0 charges, cant use it, and removes it
        System.out.println(inv.toString()); //prints the remaining item which is Stone
    }
}
