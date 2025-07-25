import java.util.ArrayList;
import java.util.List;

public class FlightManager {
    private List<Flight> flights;
    private List<Passenger> passengers;
    private List<Pilot> pilots;

    public FlightManager() {
        flights = new ArrayList<>();
        passengers = new ArrayList<>();
        pilots = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
       .add(flight);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }
}