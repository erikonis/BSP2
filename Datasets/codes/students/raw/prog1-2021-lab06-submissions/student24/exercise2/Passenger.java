package exercise2;

public class Passenger extends Person{
    private int loyalityCardNumber;

    public Passenger(String name, String passportNumber, int loyalityCardNumber){
        super(name, passportNumber);
        this.loyalityCardNumber = loyalityCardNumber;
    }

    public int getLoyalityCardNumber() {
        return loyalityCardNumber;
    }
    
}
