public class TrashItems extends Item{

    public TrashItems(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public void use(Item item) {
        System.out.println("Trash item "+item.getName()+" can not be used!"+"\n"); 
    }
    
    public String toString() {
        return "["+getRarity()+"] "+getName()+" ("+getValue()+" Gold)";
    }



}
