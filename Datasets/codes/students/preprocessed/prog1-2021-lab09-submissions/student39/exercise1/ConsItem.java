public class ConsItem extends Item {

    private String name;
    private int value;
    private Rarity rarity;
    private int charge;

    public ConsItem(String name, int value, Rarity rarity, int charge){
        super (name,value,rarity);
        this.name = name;
        this.value = value;
        this.rarity = rarity;
        this.charge = charge;
    }

    @Override
    public int getCharge(){
        return charge;
    }


    

    @Override
    public void use(){
        if (charge == 0){
            System.out.println("The consumable item " + name +  "has no charges left.");
        }
        else {
            charge = charge -1;
            System.out.println("Used the consumable item " + name + " (" + charge + " charges left)");
            if (charge == 0){
                System.out.println("The consumable item " + name +  " has no charges left.");
            }
        }
        
    }

    @Override
    public String toString(){
        return "[" + rarity + "]" + " " + name + " (" + value + " Gold) - " + charge + " charges";
    }
    


    
}
