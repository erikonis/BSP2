import java.util.HashMap;
import java.util.Map;

public final class FlightRegistry {
    private final Map<Person, Set<Flight>> personFlights = new HashMap<>();

    public void registerFlight(Person person, Flight flight) {
        personFlights.computeIfAbsent(person, k -> new HashSet<>()).add(flight);
    }

    public Set<Flight> getFlightsForPerson(Person person) {
        return Set.copyOf(personFlights.getOrDefault(person, Set.of()));
    }
}