public class Trash extends Items implements Sellable{

    public Trash(String name, int value, Rarity rarity){
        super(name, value, rarity);
    }    

    public void use(){
        super.use();
    }

    @Override
    public String toString(){
        return "[" + getRarity() + "] " + getName() + " (" + getValue() + ")";
    }
}
