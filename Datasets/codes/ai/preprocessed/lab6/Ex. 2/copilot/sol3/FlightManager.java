import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightManager {
    private Map<Flight, List<Participant>> flightParticipants;

    public FlightManager() {
        this.flightParticipants = new HashMap<>();
    }

    public void addFlight(Flight flight) {
        flightParticipants.putIfAbsent(flight, new ArrayList<>());
    }

    public void addParticipant(Flight flight, Participant participant) {
        flightParticipants.get(flight).add(participant);
    }

    public Map<Flight, List<Participant>> getFlightParticipants() {
        return flightParticipants;
    }
}