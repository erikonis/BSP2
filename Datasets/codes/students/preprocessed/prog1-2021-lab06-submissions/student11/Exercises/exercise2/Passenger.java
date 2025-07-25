public class Passenger extends Person {
    private int loyaltyCardNumber;

    public Passenger(String name, String passporNumber, int loyaltyCardNumber) {
        super(name, passporNumber);
        super.setPilot(false);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    
    
    
}
