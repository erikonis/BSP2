public class Main {
    public static void main(String[] args) {
        Airport airport1 = new Airport("Luxembourg City", "Luxembourg", "LUX");
        Airport airport2 = new Airport("Paris", "France", "CDG");

        Flight flight = new Flight("LX123", airport1, airport2);

        Passenger passenger = new Passenger("John Doe", "P123456", 12345);
        Pilot pilot = new Pilot("Jane Smith", "P654321", "Luxair");

        System.out.println("Flight Number: " + flight.getNumber());
        System.out.println("Origin: " + flight.getOrigin().getCity());
        System.out.println("Destination: " + flight.getDestination().getCity());

        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passenger Passport Number: " + passenger.getPassportNumber());
        System.out.println("Passenger Loyalty Card Number: " + passenger.getLoyaltyCardNumber());

        System.out.println("Pilot Name: " + pilot.getName());
        System.out.println("Pilot Passport Number: " + pilot.getPassportNumber());
        System.out.println("Pilot Airline: " + pilot.getAirline());
    }
}
