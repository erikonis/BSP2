package exercise2;

public class Pilot extends Person implements FlightParticipant {
    private String airline;

    public Pilot(String name, String passportNumber, String airline) {
        super(name, passportNumber);
        this.airline = airline;
    }

    @Override
    public String getIdentifier() {
        return getPassportNumber();
    }
}
