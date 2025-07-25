public class Passenger extends Person {

    private int loyaltyCardNumber;

    public Passenger(int loyaltyCardNumber, String passportNumber, String name) {
        super(name, passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    Passenger() {
    }

    public String toString() {
        return "Name: " + name + "\tPassport ID: " + passportNumber + "\tLoyalty Card number: " + loyaltyCardNumber;
    }

}
