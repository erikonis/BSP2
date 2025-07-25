package lu.uni.programming1.lab6.exercise2;

public class Passenger extends Person {
    private int loyaltyCardNumber;
    //constructor
    public Passenger (String name, String passportNumber, int loyaltyCardNumber){
        super(name, passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }
    public int getLoyaltyCardNumber(){
        return loyaltyCardNumber;
    }
}
