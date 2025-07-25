public class Consumable extends Item implements Sell {
    private int limited;

    public Consumable(String name, int value, String itemrarity, int limited) {
        super(name, value, itemrarity);
        this.limited = Math.max(0, limited);
    }
    public int left()
    {
        return limited;
    }

    public boolean use()
    {
        String name= super.getName();
        boolean answer=super.use();
        if(limited!=0)
        {
            limited=limited-1;
            System.out.println("Used the consumable item "+name+". ("+limited+" charges left)");
        }
        else
        {
            System.out.println("The consumable item "+name+" has no charges left.");
            
            answer=false;
            
        }
        return answer;

    }
    @Override
    public String toString() {
        return super.toString()+"- "+limited+" charges";
    }
    
    
}
