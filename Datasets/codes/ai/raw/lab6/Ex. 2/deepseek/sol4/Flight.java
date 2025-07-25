import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Flight {
    private String number;
    private final Airport origin;
    private final Airport destination;
    private final Set<Pilot> pilots = new HashSet<>();
    private final Set<Passenger> passengers = new HashSet<>();

    public Flight(String number, Airport origin, Airport destination) {
        validateNumber(number);
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    private void validateNumber(String number) {
        if (number == null || number.isBlank()) {
            throw new IllegalArgumentException("Flight number cannot be null or blank");
        }
    }

    public void addPilot(Pilot pilot) {
        if (pilot == null) {
            throw new IllegalArgumentException("Pilot cannot be null");
        }
        pilots.add(pilot);
    }

    public void addPassenger(Passenger passenger) {
        if (passenger == null) {
            throw new IllegalArgumentException("Passenger cannot be null");
        }
        passengers.add(passenger);
    }

    public Set<Pilot> getPilots() {
        return Collections.unmodifiableSet(pilots);
    }

    public Set<Passenger> getPassengers() {
        return Collections.unmodifiableSet(passengers);
    }
    public String getNumber() {
        return number;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public void addCrewMember(Person person) {
        crew.add(person);
    }

    public List<Person> getCrew() {
        return new ArrayList<>(crew);
    }

    @Override
    public String toString() {
        return "Flight " + number + " from " + origin + " to " + destination;
    }
}