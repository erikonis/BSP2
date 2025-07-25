public class AirTravelDemo {
    public static void main(String[] args) {
        // Create airports
        Airport lax = new Airport("Los Angeles", "USA", "LAX");
        Airport jfk = new Airport("New York", "USA", "JFK");
        Airport heathrow = new Airport("London", "UK", "LHR");

        // Create people
        Passenger passenger1 = new Passenger("John Doe", "P123456", 1001);
        Passenger passenger2 = new Passenger("Jane Smith", "P654321", 2002);
        Pilot pilot1 = new Pilot("Captain James", "P987654", "Delta Airlines");
        Pilot pilot2 = new Pilot("First Officer Sarah", "P456789", "Delta Airlines");

        // Create flights
        Flight flight1 = new Flight("DL123", lax, jfk);
        Flight flight2 = new Flight("BA456", jfk, heathrow);

        // Add crew and passengers
        flight1.addCrewMember(pilot1);
        flight1.addCrewMember(pilot2);
        flight1.addPassenger(passenger1);
        
        flight2.addCrewMember(pilot1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger2);

        // Print flight information
        System.out.println("Flight Information:");
        System.out.println(flight1);
        System.out.println("  Crew: " + flight1.getCrew());
        System.out.println("  Passengers: " + flight1.getPassengers());
        
        System.out.println(flight2);
        System.out.println("  Crew: " + flight2.getCrew());
        System.out.println("  Passengers: " + flight2.getPassengers());
    }
}