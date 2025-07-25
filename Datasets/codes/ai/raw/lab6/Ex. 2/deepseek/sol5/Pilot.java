public class Pilot extends Person {
    private String airline;

    public Pilot(String name, String passportNumber, String airline) {
        super(name, passportNumber);
        setAirline(airline);
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        if (airline == null || airline.trim().isEmpty()) {
            throw new IllegalArgumentException("Airline cannot be null or empty");
        }
        this.airline = airline;
    }

    @Override
    public String toString() {
        return super.toString() + " [Airline: " + airline + "]";
    }
}