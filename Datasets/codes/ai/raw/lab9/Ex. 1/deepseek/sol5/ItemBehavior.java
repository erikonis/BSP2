public interface ItemBehavior {
    void onUse(Item item, Player player);
    void onEquip(Item item, Player player);
    void onDrop(Item item, Player player);
}