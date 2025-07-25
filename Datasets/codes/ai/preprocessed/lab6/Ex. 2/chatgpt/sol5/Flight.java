import java.util.HashSet;
import java.util.Set;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;

    private Pilot pilot;
    private Set<Passenger> passengers = new HashSet<>();

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

    // Methods for managing passengers and pilot
    public void assignPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public boolean addPassenger(Passenger p) {
        return passengers.add(p);
    }

    public boolean removePassenger(Passenger p) {
        return passengers.remove(p);
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flight ").append(number)
          .append(" [").append(origin).append(" → ").append(destination).append("]\n")
          .append("Pilot: ").append(pilot != null ? pilot : "None").append("\n")
          .append("Passengers:\n");
        if (passengers.isEmpty()) {
            sb.append("  (none)\n");
        } else {
            for (Passenger p : passengers) {
                sb.append("  - ").append(p).append("\n");
            }
        }
        return sb.toString();
    }
}