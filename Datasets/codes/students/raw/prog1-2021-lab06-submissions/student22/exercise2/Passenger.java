package lu.uni.programming.Lab6.exercise2;

public class Passenger extends Person {

    private int loyaltyCardNumber;

    public Passenger(String name, String passeportNumber, int loyaltyCardNumber) {
        super(name, passeportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }
    
}
