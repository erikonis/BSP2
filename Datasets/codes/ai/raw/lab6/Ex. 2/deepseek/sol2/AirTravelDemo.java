public class AirTravelDemo {
    public static void main(String[] args) {
        // Create airports
        Airport lux = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport fra = new Airport("Frankfurt", "Germany", "FRA");
        Airport cdg = new Airport("Paris", "France", "CDG");

        // Create flights
        Flight lh123 = new Flight("LH123", lux, fra);
        Flight af456 = new Flight("AF456", lux, cdg);

        // Create people
        Passenger john = new Passenger("John Doe", "P123456", 789012);
        Passenger jane = new Passenger("Jane Smith", "P654321", 345678);
        Pilot captain = new Pilot("Mike Johnson", "P987654", "Luxair");

        // Assign pilot to flights
        lh123.assignPilot(captain);
        af456.assignPilot(captain);

        // Add passengers to flights
        lh123.addPassenger(john);
        lh123.addPassenger(jane);
        af456.addPassenger(john);

        // Display information
        System.out.println("=== Flight Information ===");
        System.out.println(lh123);
        System.out.println("  Pilot: " + lh123.getPilot().getName());
        System.out.println("  Passengers:");
        lh123.getPassengers().forEach(p -> 
            System.out.println("    - " + p.getName() + " (Loyalty: " + p.getLoyaltyCardNumber() + ")"));

        System.out.println("\n=== Passenger Information ===");
        System.out.println(john.getName() + "'s flights:");
        john.getFlights().forEach(f -> System.out.println("  - " + f));

        System.out.println("\n=== Pilot Information ===");
        System.out.println(captain.getName() + "'s assigned flights:");
        captain.getAssignedFlights().forEach(f -> System.out.println("  - " + f));
    }
}