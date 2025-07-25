import java.util.ArrayList;
import java.util.List;

public class Pilot extends Person {
    private String airline;
    private final List<Flight> assignedFlights = new ArrayList<>();

    public Pilot(String name, String passportNumber, String airline) {
        super(name, passportNumber);
        this.airline = airline;
    }

    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }

    public void assignFlight(Flight flight) {
        assignedFlights.add(flight);
    }

    public List<Flight> getAssignedFlights() {
        return new ArrayList<>(assignedFlights); // Return copy for encapsulation
    }
}