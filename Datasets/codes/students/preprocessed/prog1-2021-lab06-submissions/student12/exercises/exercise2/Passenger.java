public class Passenger extends Person
{
    private int loyaltyCardNumber;

    public Passenger(String pName, String pPP, int pLC) {
        super(pName, pPP);
        loyaltyCardNumber = pLC;
    }
    
    public int getLoyaltyCardNumber()
    {
        return loyaltyCardNumber;
    }
}
