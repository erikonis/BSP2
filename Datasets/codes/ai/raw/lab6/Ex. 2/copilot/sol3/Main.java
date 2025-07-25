package exercise2;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Airport airport1 = new Airport("Luxembourg City", "Luxembourg", "LUX");
        Airport airport2 = new Airport("Paris", "France", "CDG");

        Flight flight1 = new Flight("LX123", airport1, airport2);

        Passenger passenger1 = new Passenger("John Doe", "P123456", 12345);
        Pilot pilot1 = new Pilot("Jane Smith", "P654321", "Luxair");

        FlightManager flightManager = new FlightManager();
        flightManager.addFlight(flight1);
        flightManager.addParticipant(flight1, passenger1);
        flightManager.addParticipant(flight1, pilot1);

        System.out.println("Flights and Participants:");
        for (Map.Entry<Flight, List<Participant>> entry : flightManager.getFlightParticipants().entrySet()) {
            Flight flight = entry.getKey();
            List<Participant> participants = entry.getValue();
            System.out.println("Flight " + flight.getNumber() + " from " + flight.getOrigin().getCity() + " to " + flight.getDestination().getCity());
            for (Participant participant : participants) {
                System.out.println(" - " + participant.getName() + " (" + participant.getPassportNumber() + ")");
            }
        }
    }
}