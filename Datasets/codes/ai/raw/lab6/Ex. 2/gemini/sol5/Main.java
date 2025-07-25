// Main.java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some airports
        Airport lux = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport fra = new Airport("Frankfurt", "Germany", "FRA");
        Airport par = new Airport("Paris", "France", "CDG");

        // Create some flights
        Flight lx123 = new Flight("LX123", lux, fra);
        Flight lh456 = new Flight("LH456", fra, par);
        Flight af789 = new Flight("AF789", par, lux);

        // Create some passengers
        Passenger alice = new Passenger("Alice Smith", "AS12345", 123456);
        Passenger bob = new Passenger("Bob Johnson", "BJ67890", 789012);
        Passenger charlie = new Passenger("Charlie Brown", "CB11223", 345678);

        // Create some pilots
        Pilot david = new Pilot("David Miller", "DM22334", "Luxair");
        Pilot eve = new Pilot("Eve Williams", "EW55667", "Lufthansa");

        // Assign passengers to flights
        lx123.addPassenger(alice);
        lx123.addPassenger(bob);
        lh456.addPassenger(bob);
        af789.addPassenger(charlie);

        alice.addFlight(lx123);
        bob.addFlight(lx123);
        bob.addFlight(lh456);
        charlie.addFlight(af789);

        // Assign pilots to flights
        lx123.addPilot(david);
        lh456.addPilot(eve);

        david.addFlight(lx123);
        eve.addFlight(lh456);

        // Demonstrate retrieving information
        System.out.println("Flights:");
        System.out.println(lx123);
        System.out.println(lh456);
        System.out.println(af789);

        System.out.println("\nPassengers on " + lx123.getNumber() + ":");
        for (Passenger passenger : lx123.getPassengers()) {
            System.out.println(passenger);
        }

        System.out.println("\nPilots on " + lx123.getNumber() + ":");
        for (Pilot pilot : lx123.getPilots()) {
            System.out.println(pilot);
        }

        System.out.println("\nFlights for " + bob.getName() + ":");
        for (Flight flight : bob.getFlights()) {
            System.out.println(flight);
        }

        System.out.println("\nFlights for " + david.getName() + ":");
        for (Flight flight : david.getFlights()) {
            System.out.println(flight);
        }
    }
}