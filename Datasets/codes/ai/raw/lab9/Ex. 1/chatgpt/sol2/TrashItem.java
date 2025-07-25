public record TrashItem(String name, int value, Rarity rarity) extends Item implements Sellable {
    public TrashItem {
        if (value < 0) throw new IllegalArgumentException("Trash item value cannot be negative");
    }

    @Override
    public void use() {
        System.out.println(name + " is useless. Just… trash.");
    }

    @Override
    public String toString() {
        return name + " [Trash, Value=" + value + ", Rarity=" + rarity + "]";
    }
}
