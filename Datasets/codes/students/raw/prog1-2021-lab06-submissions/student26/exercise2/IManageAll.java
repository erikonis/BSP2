package exercise2;

public class IManageAll {
    private Airport origin, destination;
    private Flight flight;
    private Person p1, p2;
    private Pilot pilot;
    private Passenger passenger;

    public IManageAll(Airport origin, Airport destination, Flight flight, Person p1, Person p2, Pilot pilot, Passenger passenger) {
        this.origin = origin;
        this.destination = destination;
        this.flight = flight;
        this.p1 = p1;
        this.p2 = p2;
        this.pilot = pilot;
        this.passenger = passenger;
    }
    
    public String ManageAll() {
        String overview = String.format("Origin: %s / %s / %s", origin.getCountry(),origin.getCity(),origin.getIataCode())
        + String.format("\nDestination: %s / %s / %s", destination.getCountry(),destination.getCity(),destination.getIataCode())
        + String.format("\nFlight number: %s", flight.getNumber())
        + String.format("\nPeople inside the plane: %s and %s", p1.getName(), p2.getName())
        + String.format("\nPilot info: %s / %s / %s", pilot.getName(),pilot.getPassportNumber(),pilot.getAirline())
        + String.format("\nPassenger info: %s / %s / %s", passenger.getName(),passenger.getPassportNumber(),passenger.getLoyaltyCardNumber());
        return overview;
    }
}
