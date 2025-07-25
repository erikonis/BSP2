public class trash extends item {

    public trash(String name, int value, rarity rarity) {
        super(name, value, rarity);
    }
    
    @Override
    public String toString()
    {
        String description = (getName() + " [" + getRarity() + "] (" + getValue() + ")");
        return description;
    }


}
