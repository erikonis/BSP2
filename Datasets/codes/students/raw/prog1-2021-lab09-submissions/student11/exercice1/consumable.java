package lu.uni.programming1.lab9.exercice1;

public class consumable extends item {
    
    private int charges;

    public consumable(String name, int value, rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }


    @Override
    public String toString()
    {
        String charges = "charges";
        if (getCharges() == 1) {charges = "charge";}
        String description = (getName() + " [" + getRarity() + "] (" + getValue() + ") - "
         + getCharges() + " " + charges + " left");
        return description;
    }

    public void use()
    {
        if (getCharges() == 0)
        {
            System.out.println("Can't use " + getName() + ". There are no charges left.");
        }
        else
        {
        String charges = "charges";
        setCharges(getCharges() - 1);
        if (getCharges() == 1) {charges = "charge";}
        System.out.println("Used " + getName() + ". (" + getCharges() + " " + charges + " left.)");
        }
    }

}
