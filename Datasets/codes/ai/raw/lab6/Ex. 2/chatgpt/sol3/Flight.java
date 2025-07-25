import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;

    private Pilot pilot;
    private List<Passenger> passengers = new ArrayList<>();

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    // getters / setters
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Airport getOrigin() {
        return origin;
    }
    public void setOrigin(Airport origin) {
        this.origin = origin;
    }
    public Airport getDestination() {
        return destination;
    }
    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    // participation management
    public void assignPilot(Pilot pilot) {
        this.pilot = pilot;
    }
    public Pilot getPilot() {
        return pilot;
    }

    public void addPassenger(Passenger p) {
        if (!passengers.contains(p)) {
            passengers.add(p);
        }
    }
    public void removePassenger(Passenger p) {
        passengers.remove(p);
    }
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flight ").append(number)
          .append(" from ").append(origin)
          .append(" to ").append(destination)
          .append("\n Pilot: ").append(pilot != null ? pilot : "none assigned")
          .append("\n Passengers:\n");
        for (Passenger p : passengers) {
            sb.append("  - ").append(p).append("\n");
        }
        return sb.toString();
    }
}
