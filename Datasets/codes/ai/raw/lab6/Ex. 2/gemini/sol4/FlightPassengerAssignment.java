// FlightPassengerAssignment.java
public class FlightPassengerAssignment {
    private Flight flight;
    private Passenger passenger;

    public FlightPassengerAssignment(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}