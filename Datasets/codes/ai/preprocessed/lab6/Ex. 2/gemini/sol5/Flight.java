import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;
    private List<Passenger> passengers;
    private List<Pilot> pilots;

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.pilots = new ArrayList<>();
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

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void removePilot(Pilot pilot) {
        this.pilots.remove(pilot);
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    @Override
    public String toString() {
        return "Flight " + number + " from " + origin + " to " + destination;
    }
}