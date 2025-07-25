package lu.uni.programming1.lab9.exercise1;

public class GearItem extends Item
{
    private int criticalHit;
    private int determination;
    private int directHit;

    public GearItem(String pName, int pValue, Color pRyrity, int pCH, int pD, int pDH)
    {
        super(pName, pValue, pRyrity, 0);
        criticalHit = pCH;
        determination = pD;
        directHit = pDH;
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    public int getTotal()
    {
        return criticalHit + determination + directHit;
    }

    @Override
    public String toString() {
        String text = " - " + getCriticalHit() + " Critical Hit / " + getDetermination() + " Determination / " + getDirectHit() + " Direct Hit";
        return super.toString() + text;
    }

    @Override
    public int compareTo(Item o) {

        GearItem op = (GearItem) o;
        int totalO = op.getCriticalHit() + op.getDetermination() + op.getDirectHit();
        int total = getCriticalHit() + getDetermination() + getDirectHit();
        int result = total - totalO;

        return result;
    }
}