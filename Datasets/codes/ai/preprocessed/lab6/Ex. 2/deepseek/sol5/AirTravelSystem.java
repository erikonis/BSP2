public class AirTravelSystem {
    public static void main(String[] args) {
        // Create airports
        Airport newYork = new Airport("New York", "USA", "JFK");
        Airport london = new Airport("London", "UK", "LHR");
        Airport tokyo = new Airport("Tokyo", "Japan", "HND");

        // Create people
        Passenger passenger1 = new Passenger("John Smith", "US123456", 1001);
        Passenger passenger2 = new Passenger("Emma Johnson", "UK654321", 2002);
        Pilot pilot1 = new Pilot("Captain Davis", "US987654", "Delta Airlines");
        Pilot pilot2 = new Pilot("First Officer Wilson", "UK456789", "British Airways");

        // Create flights
        Flight flight1 = new Flight("DL123", newYork, london);
        Flight flight2 = new Flight("BA456", london, tokyo);

        // Add crew and passengers
        flight1.addPilot(pilot1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);

        flight2.addPilot(pilot2);
        flight2.addPassenger(passenger2);

        // Display flight information
        System.out.println("=== Flight Information ===");
        displayFlightDetails(flight1);
        displayFlightDetails(flight2);
    }

    private static void displayFlightDetails(Flight flight) {
        System.out.println("\n" + flight);
        System.out.println("Pilots:");
        for (Pilot pilot : flight.getPilots()) {
            System.out.println("  " + pilot);
        }
        System.out.println("Passengers:");
        for (Passenger passenger : flight.getPassengers()) {
            System.out.println("  " + passenger);
        }
    }
}