public class Pilot extends Person {
    private String airline;

    public Pilot(String name, String passportNumber, String airline) {
        super(name, passportNumber);
        this.airline = airline;
    }

    public String getAirline() {
        return this.airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "\nPilot: " +
               super.toString() +
               "\n\tAirline: " + getAirline();
    }
}
