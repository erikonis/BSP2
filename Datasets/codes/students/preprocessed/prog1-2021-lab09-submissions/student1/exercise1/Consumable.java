public class Consumable extends Item {

    private int charges; 
    static int count;
    // private boolean consume;

    public Consumable () {
        
    }
    
    public Consumable(Rarity rarity, String name, int value, int charges) {
        super(rarity, name, value);
        this.charges = charges;
        // this.consume = false;
    }
    public int getCharges() {
        return charges;
    }

    @Override
    public void use(){
        if(charges>0){
     System.out.println("Used the consumable item "+name+".");
        }else{
            System.out.println("The consumable item "+name+" has no charges left");
        }
    }

    @Override
    public String toString() {
        return "["+rarity+"] "+name+" ("+value+" Gold) - "+charges+" charges";
    }

    // public void consumed(){
    //     if()
    //     count++;
    //     System.out.println("\t" + count + ". Order : " + this);
    // }
    // public void setConsume(boolean consume) {
    //     this.consume = consume;
    // }
    // public boolean isConsume(){
    //     return consume;
    // }

}
