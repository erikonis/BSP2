public class ConsumableItem extends Item {
    private int charges;

    public ConsumableItem(String name, int value, Colours rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public void use() {
        if (charges > 0) {
            charges -= 1;
            System.out.printf("\nUsed consumable item: %s (%d charges left)",getName(),charges);
        }

    }

    public int getCharges() {
        return charges;
    }

    protected void setCharges(int charges) {
        this.charges = charges;
    }

    @Override
    public String toString(){
        return String.format("[%s] %s (%d Gold)",getRarity(),getName(),getValue())
        + String.format(" - %d charges", getCharges());
    }

}
