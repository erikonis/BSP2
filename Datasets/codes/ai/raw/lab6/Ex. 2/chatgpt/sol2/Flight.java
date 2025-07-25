package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;
    private List<Passenger> passengers = new ArrayList<>();
    private List<Pilot> pilots = new ArrayList<>();

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public List<Passenger> getPassengers() { return passengers; }
    public List<Pilot> getPilots() { return pilots; }
}
