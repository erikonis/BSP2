import java.util.ArrayList;
import java.util.List;

public class FlightManager {
    private List<Flight> flights;
    private List<Person> participants;

    public FlightManager() {
        this.flights = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addParticipant(Person person) {
        participants.add(person);
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Person> getParticipants() {
        return participants;
    }
}