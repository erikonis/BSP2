package exercise2_basic;

public class Main {
    public static void main(String[] args) {
        Airport lux = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport par = new Airport("Paris", "France", "CDG");
        Airport lon = new Airport("London", "UK", "LHR");

        Flight flight1 = new Flight("LX123", lux, par);
        Flight flight2 = new Flight("BA456", lon, lux);

        Passenger passenger1 = new Passenger("Alice", "PA123", 12345);
        Pilot pilot1 = new Pilot("Bob", "PB456", "Luxair");

        System.out.println(flight1);
        System.out.println(passenger1.getName() + " " + passenger1.getLoyaltyCardNumber());
        System.out.println(pilot1.getName() + " " + pilot1.getAirline());
    }
}