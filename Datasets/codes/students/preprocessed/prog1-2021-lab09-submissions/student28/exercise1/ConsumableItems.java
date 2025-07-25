public class ConsumableItems extends Item{

    
    private int charges;
    public ConsumableItems(String name, double cost, Rarity rarity, int charges) {
        super(name, cost, rarity);
        this.charges = charges;
    }
    
    public int getCharges() {
        return charges;
    }


    public void setCharges(int charges) {
        this.charges = charges;
    }
    
    @Override
    public void use(){
        if(charges>0){
            charges--;
            System.out.println("Used the consumable item " + super.getName() +". (" + charges + " charges left)");
            
        }
        else{
            if(charges == 0){
                System.out.println("The consumable item " + super.getName() + " has no charges left");
            }
        }
        
    }

    @Override
    public String toString(){
        return "[" + super.getRarity() + "] "+ super.getName() +" potion (" + super.getCost() + " Gold) - " + charges + " charges" ;
    }
    
}
