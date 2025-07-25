import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;
    private final List<Person> crew;
    private final List<Passenger> passengers;

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
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

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public List<Person> getCrew() {
        return new ArrayList<>(crew);
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    @Override
    public String toString() {
        return "Flight " + number + " from " + origin + " to " + destination;
    }
}