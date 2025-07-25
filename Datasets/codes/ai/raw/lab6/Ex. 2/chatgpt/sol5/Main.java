public class Main {
    public static void main(String[] args) {
        // Create airports
        Airport luxembourg = new Airport("Luxembourg City", "Luxembourg", "LUX");
        Airport frankfurt = new Airport("Frankfurt", "Germany", "FRA");
        Airport newYork = new Airport("New York", "USA", "JFK");

        // Create flights
        Flight flight1 = new Flight("LX101", luxembourg, frankfurt);
        Flight flight2 = new Flight("LX202", frankfurt, newYork);

        // Create a pilot and passengers
        Pilot pilot = new Pilot("Emma Skies", "P-998877", "LuxAir");
        Passenger passenger1 = new Passenger("Bob Brown", "B-123456", 555);
        Passenger passenger2 = new Passenger("Alice Green", "A-654321", 777);

        // Assign pilot and passengers to flight1
        flight1.assignPilot(pilot);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);

        // Display the details of flight1
        System.out.println(flight1);
        System.out.println("--------------");
        // Flight2 details (no passengers, just an empty flight)
        System.out.println(flight2);
    }
}
