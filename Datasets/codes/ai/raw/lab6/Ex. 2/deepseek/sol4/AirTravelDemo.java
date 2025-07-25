public class AirTravelDemo {
    public static void main(String[] args) {
        // Initialize airports
        Airport lax = new Airport("Los Angeles", "USA", "LAX");
        Airport jfk = new Airport("New York", "USA", "JFK");

        // Create people
        Passenger passenger = new Passenger("Alice", "P123456", 1001);
        Pilot pilot = new Pilot("Bob", "P987654", "Delta");

        // Create flights
        Flight flight1 = new Flight("DL123", lax, jfk);
        Flight flight2 = new Flight("DL456", jfk, lax);

        // Manage participation
        FlightRegistry registry = new FlightRegistry();
        
        flight1.addPilot(pilot);
        flight1.addPassenger(passenger);
        registry.registerFlight(pilot, flight1);
        registry.registerFlight(passenger, flight1);

        flight2.addPilot(pilot);
        registry.registerFlight(pilot, flight2);

        // Display information
        System.out.println("Pilot's flights: " + registry.getFlightsForPerson(pilot));
        System.out.println("Passenger's flights: " + registry.getFlightsForPerson(passenger));
    }
}