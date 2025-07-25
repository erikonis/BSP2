package lu.uni.programming1.lab9.exercise1;

public class item {
    String name;
    Rarity rarity;
    Types type;
    int criticalHit;
    int determination;
    int directHit;
    int gold, quantity;
    private static int indx;

    item(String name, Rarity rarity, Types type, int criticalHit, int determination, int directHit, int gold,
            int quantity) {
        this.name = name;
        this.rarity = rarity;
        this.type = type;
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
        this.gold = gold;
        this.quantity = quantity;
    }

    public Types getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getGold() {
        return gold;
    }

    public item getItem(item item) {
        return item;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    public static void display(item item) {
        indx++;
        if (item.getType() == Types.GEAR)
            System.out.println("{" + indx + "}" + "[" + item.getRarity() + "] " + item.getName() + "(" + item.getGold()
                    + " gold)" + " - " + item.getCriticalHit() + " critical hit / " + item.getDetermination()
                    + " determination / " + item.getDirectHit() + " direct hit");
        else
            System.out.println(
                    "{" + indx + "}" + "[" + item.getRarity() + "] " + item.getName() + item.getQuantity() + "x"
                            + " (" + item.getGold() + " gold)");
    }
}