public class Trash extends Item{

    public Trash(String name, int value) {
        super(name, value, Rarity.WHITE);
    }

    public void use() {
        System.out.println("This item can not be used");
    }
    
    
}
