public class Passenger extends Person {
    private final int loyaltyCardNumber;

    public Passenger(String name, String passportNumber, int loyaltyCardNumber) {
        super(name, passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " [Loyalty: " + loyaltyCardNumber + "]";
    }
}