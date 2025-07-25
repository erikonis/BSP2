public class FlightCrewAssignment {
    private Flight flight;
    private Pilot pilot;

    public FlightCrewAssignment(Flight flight, Pilot pilot) {
        this.flight = flight;
        this.pilot = pilot;
    }

    public Flight getFlight() {
        return flight;
    }

    public Pilot getPilot() {
        return pilot;
    }
}