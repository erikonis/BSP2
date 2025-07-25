import java.util.Random;

public class Passenger extends Person {

    private int loyaltyCardNumber; 
    
    public Passenger(String name, String passportNumber, int loyaltyCardNumber){
        super(name,passportNumber);
        Random random = new Random();
        loyaltyCardNumber = random.nextInt(10000000);
        this.loyaltyCardNumber=loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() {
        
        return loyaltyCardNumber;

    }

    @Override
    public String toString() {
            return " \n ---- Boarding Pass ---- \n "
                    + name+ " is on board. \n Passport Number : "
                    + passportNumber
                    + "\n Loyalty Card Number : "
                    + loyaltyCardNumber;
    }


}
