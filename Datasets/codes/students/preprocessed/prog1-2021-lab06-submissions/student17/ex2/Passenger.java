public class Passenger{ 
    private int loyaltyCardNumber;

    public Passenger(String name, String passportNumber, int loyaltyCardNumber) {
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    @Override
    public String toString() {
        return "Passenger [loyaltyCardNumber=" + loyaltyCardNumber + "]";
    }
    
}