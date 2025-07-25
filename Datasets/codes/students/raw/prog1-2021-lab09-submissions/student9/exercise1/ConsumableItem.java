package lu.uni.programming1.lab9.exercise1;

public class ConsumableItem extends Item
{
    public ConsumableItem(String pName, int pValue, Color pRyrity, int pCharges) {
        super(pName, pValue, pRyrity, pCharges);
    }

    @Override
    public String toString() {
        String text = " - " + getCharges() + " charges";
        return super.toString() + text;
    }
}
