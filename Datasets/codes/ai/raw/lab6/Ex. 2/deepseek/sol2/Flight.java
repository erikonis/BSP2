import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;
    private final List<Passenger> passengers = new ArrayList<>();
    private Pilot pilot;

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    // Getters and setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public Airport getOrigin() { return origin; }
    public void setOrigin(Airport origin) { this.origin = origin; }
    public Airport getDestination() { return destination; }
    public void setDestination(Airport destination) { this.destination = destination; }

    // Flight management methods
    public void assignPilot(Pilot pilot) {
        this.pilot = pilot;
        pilot.assignFlight(this);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        passenger.addFlight(this);
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers); // Return copy for encapsulation
    }

    public Pilot getPilot() { return pilot; }

    @Override
    public String toString() {
        return "Flight " + number + " from " + origin + " to " + destination;
    }
}