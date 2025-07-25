import java.util.Objects;

public class Passenger extends Person {
    private int loyaltyCardNumber;

    public Passenger(String name, String passportNumber, int loyaltyCardNumber) {
        super(name, passportNumber);
        this.loyaltyCardNumber = validateLoyaltyCardNumber(loyaltyCardNumber);
    }

    private int validateLoyaltyCardNumber(int loyaltyCardNumber) {
        if (loyaltyCardNumber <= 0) {
            throw new IllegalArgumentException("Loyalty card number must be positive (was " + loyaltyCardNumber + ")");
        }
        return loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return super.equals(o) && loyaltyCardNumber == passenger.loyaltyCardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loyaltyCardNumber);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "loyaltyCardNumber=" + loyaltyCardNumber +
                "} " + super.toString();
    }
}