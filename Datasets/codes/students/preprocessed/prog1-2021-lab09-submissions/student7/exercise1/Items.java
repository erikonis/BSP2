public class Items {

    static int i;

    String name;

    public String getName() {
        return name;
    }

    Rarity rarity;

    public Rarity getRarity() {
        return rarity;
    }

    Types type;

    public Types getType() {
        return type;
    }

    int attack;

    public int getAttack() {
        return attack;
    }

    int defense;

    public int getDefense() {
        return defense;
    }

    int speed;

    public int getSpeed() {
        return speed;
    }

    int gold;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    boolean drop;

    public boolean isDrop(){
        return drop;
    }

    boolean sold;

    public boolean isSold(){
        return drop;
    }

    Items(String name, Rarity rarity, Types type, int attack, int defense, int speed, int gold, boolean sold, boolean drop, int quantity){
        this.name = name;
        this.rarity = rarity;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.gold = gold;
        this.quantity = quantity;
        this.drop = drop;
        this.sold = sold;}
    
    public static String showItem(Items items){ i++;

        switch (items.getType()){
            case GEAR: System.out.println("-"+i+"-" + "(" + items.getRarity() +") "+ items.getName() + "(" + items.getGold() + " golds)" +
            " - " + items.getAttack() + " Attack / " + items.getDefense() + " Defense / " + items.getSpeed() + " Speed");

            break;

            case TRASH: System.out.println("-"+i +"-"+"("+items.getRarity()+") " + items.getName() + items.getQuantity() + "x" + " ("+items.getGold()+" golds)");

            break;

            case CONSUMABLE:System.out.println("-"+i+"-"+"(" + items.getRarity() + ") " + items.getName() + items.getQuantity() + "x" + " (" +items.getGold()+" golds)");

            break;

        }
        return null;
    
    }
    
}
