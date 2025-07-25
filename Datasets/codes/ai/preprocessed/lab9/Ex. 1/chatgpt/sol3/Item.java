public interface Item {
    String getName();
    int getValue();
    Rarity getRarity();
    void use();
    boolean isDepleted(); // gear/trash return false
    boolean isSellable(); // only trash/consumables
}