import java.util.Objects;

public class FlightAssignment {
    private final Flight flight;
    private final Person person; // Could be Passenger or Pilot

    public FlightAssignment(Flight flight, Person person) {
        this.flight = Objects.requireNonNull(flight, "Flight cannot be null");
        this.person = Objects.requireNonNull(person, "Person cannot be null");
    }

    public Flight getFlight() {
        return flight;
    }

    public Person getPerson() {
        return person;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightAssignment that = (FlightAssignment) o;
        return Objects.equals(flight, that.flight) && Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flight, person);
    }

    @Override
    public String toString() {
        return "FlightAssignment{" +
                "flight=" + flight +
                ", person=" + person +
                "}";
    }
}
