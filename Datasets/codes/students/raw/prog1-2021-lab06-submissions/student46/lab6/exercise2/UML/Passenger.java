package lab6.exercise2.UML;

public class Passenger extends Person{
    private int loyaltyCardNumber;

    public Passenger(String name, String passportNumber, int loyaltyCardNumber)
    {
        super(name, passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber()
    {
        return loyaltyCardNumber;
    }
}
