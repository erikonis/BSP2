package exercise2;

public class Main {
    public static void main(String[] args) {
        Airport lux = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport lhr = new Airport("London", "UK", "LHR");

        Flight flight1 = new Flight("LX123", lux, lhr);

        Passenger p1 = new Passenger("John Doe", "A1234567", 1001);
        Passenger p2 = new Passenger("Jane Smith", "B7654321", 1002);

        Pilot pilot = new Pilot("Captain Mike", "P9876543", "LuxAir");

        flight1.addPassenger(p1);
        flight1.addPassenger(p2);
        flight1.addPilot(pilot);

        System.out.println("Flight " + flight1.getPassengers().size() + " passengers.");
    }
}
