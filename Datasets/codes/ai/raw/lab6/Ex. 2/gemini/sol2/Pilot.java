import java.util.Objects;

public class Pilot extends Person {
    private String airline;

    public Pilot(String name, String passportNumber, String airline) {
        super(name, passportNumber);
        this.airline = Objects.requireNonNull(airline, "Airline cannot be null");
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = Objects.requireNonNull(airline, "Airline cannot be null");
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pilot pilot = (Pilot) o;
        return super.equals(o) && Objects.equals(airline, pilot.airline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), airline);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "airline='" + airline + '\'' +
                "} " + super.toString();
    }
}