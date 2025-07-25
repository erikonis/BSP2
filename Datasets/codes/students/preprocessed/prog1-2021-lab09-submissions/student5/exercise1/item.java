public class item {
    String name;
    Rarity rarity;
    Types type;
    int critical_hit;
    int determination;
    int direct_hit;
    int gold, quantity;
    static int i;

    item(String name, Rarity rarity, Types type, int critical_hit, int determination, int direct_hit, int gold,
            int quantity) {
        this.name = name;
        this.rarity = rarity;
        this.type = type;
        this.critical_hit = critical_hit;
        this.determination = determination;
        this.direct_hit = direct_hit;
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

    public int getcritical_hit() {
        return critical_hit;
    }

    public int getdetermination() {
        return determination;
    }

    public int getdirect_hit() {
        return direct_hit;
    }

    public static void show(item item) {
        i++;
        if (item.getType() == Types.GEAR)
            System.out.println("{" + i + "}" + "[" + item.getRarity() + "] " + item.getName() + "(" + item.getGold()
                    + " gold)" + " - " + item.getcritical_hit() + " critical hit / " + item.getdetermination()
                    + " determination / " + item.getdirect_hit() + " direct hit");

        else
            System.out.println("{" + i + "}" + "[" + item.getRarity() + "] " + item.getName() + item.getQuantity() + "x"
                    + " (" + item.getGold() + " gold)");
    }
}
