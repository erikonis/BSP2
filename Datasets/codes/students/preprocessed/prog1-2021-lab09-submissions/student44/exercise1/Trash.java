public class Trash extends Items {

    public Trash(String name, int cost, Rarity rarity) {
        super(name, cost, rarity);
    }

    @Override
    void use(Items item) {
        System.out.println("Try using something else instead of "+getName()+".");       
    }
    
    @Override
    public String toString() {
        
        return "["+getRarity()+"] " +getName()+ " ("+getCost()+" Gold)";
    }
}
