package exercise2;

public class AirTravelApp {
    public static void main(String[] args) {
        Airport airport1 = new Airport("New York", "USA", "JFK");
        Airport airport2 = new Airport("London", "UK", "LHR");

        Flight flight1 = new Flight("AA123", airport1, airport2);

        Passenger passenger = new Passenger("John Doe", "A12345678", 12345);
        Pilot pilot = new Pilot("Jane Smith", "P98765432", "American Airlines");

        FlightManager flightManager = new FlightManager();
        flightManager.addFlight(flight1);

        System.out.println("Flight from " + flight1.getOrigin().getCity() + " to " + flight1.getDestination().getCity());
    }
}