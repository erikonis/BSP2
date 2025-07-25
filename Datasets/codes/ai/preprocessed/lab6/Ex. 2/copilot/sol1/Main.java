public class Main {
    public static void main(String[] args) {
        Airport airport1 = new Airport("Luxembourg City", "Luxembourg", "LUX");
        Airport airport2 = new Airport("Paris", "France", "CDG");

        Flight flight1 = new Flight("LX123", airport1, airport2);

        Passenger passenger1 = new Passenger("John Doe", "P123456", 12345);
        Pilot pilot1 = new Pilot("Jane Smith", "P654321", "Luxair");

        FlightManager flightManager = new FlightManager();
        flightManager.addFlight(flight1);
        flightManager.addParticipant(passenger1);
        flightManager.addParticipant(pilot1);

        System.out.println("Flights:");
        for (Flight flight : flightManager.getFlights()) {
            System.out.println(flight.getNumber() + " from " + flight.getOrigin().getCity() + " to " + flight.getDestination().getCity());
        }

        System.out.println("\nParticipants:");
        for (Person person : flightManager.getParticipants()) {
            System.out.println(person.getName() + " (" + person.getPassportNumber() + ")");
        }
    }
}