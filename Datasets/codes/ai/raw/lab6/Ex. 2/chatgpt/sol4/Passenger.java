package exercise2;

public class Passenger extends Person implements FlightParticipant {
    private int loyaltyCardNumber;

    public Passenger(String name, String passportNumber, int loyaltyCardNumber) {
        super(name, passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    @Override
    public String getIdentifier() {
        return getPassportNumber();
    }
}
