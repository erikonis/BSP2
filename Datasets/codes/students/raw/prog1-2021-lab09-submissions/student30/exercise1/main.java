package lu.uni.programming1.lab9.exercise1;

public class main {
    static inventory _inventory = new inventory();
    static items it = new items("Better Helmet", 250, rarity.PURPLE, types.GEAR, 10, 6, 8);
    static items it2 = new items("Mana Potion", 35, rarity.WHITE, types.TRASH, 3, 3, 4);

    public static void main(String[] args) {
        _inventory.add(it);
        _inventory.add(it2);
        _inventory.printinv(it);
        _inventory.printinv(it2);

        for (int i = 0; i < 5; i++) {
            Random();
        }
    }

    public static void Random() {
        int rand = (int) (Math.random() * 3) + 1;
        int randI = (int) (Math.random() * _inventory.getAllitems().size());
        if (rand == 1) {
            // _inventory.drop(item);
        } else if (rand == 2) {
            _inventory.sell(randI);
        } else if (rand == 3) {
            _inventory.use(randI);
        } else {
            System.out.println("Unknown choice");
        }
    }

}
