public class Trash extends Item{

    public Trash(String name, int value) {
        super(name, value, Rarity.WHITE);
    }

    public void use() {
        System.out.println("The "+super.getName()+" cannot be used");
    }

    @Override
    public String toString() {
        return  "["+super.getRarity()+"] "+super.getName()+" ("+super.getValue()+" coins)";
    }
    
    
}
