import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String number;
    private final Airport origin;
    private final Airport destination;
    private final List<Pilot> pilots;
    private final List<Passenger> passengers;

    public Flight(String number, Airport origin, Airport destination) {
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("Flight number cannot be null or empty");
        }
        if (origin == null) {
            throw new IllegalArgumentException("Origin airport cannot be null");
        }
        if (destination == null) {
            throw new IllegalArgumentException("Destination airport cannot be null");
        }
        
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.pilots = new ArrayList<>();
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
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("Flight number cannot be null or empty");
        }
        this.number = number;
    }

    public void addPilot(Pilot pilot) {
        if (pilot == null) {
            throw new IllegalArgumentException("Pilot cannot be null");
        }
        if (!pilots.contains(pilot)) {
            pilots.add(pilot);
        }
    }

    public void addPassenger(Passenger passenger) {
        if (passenger == null) {
            throw new IllegalArgumentException("Passenger cannot be null");
        }
        if (!passengers.contains(passenger)) {
            passengers.add(passenger);
        }
    }

    public List<Pilot> getPilots() {
        return new ArrayList<>(pilots);
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    @Override
    public String toString() {
        return "Flight " + number + " from " + origin + " to " + destination;
    }
}