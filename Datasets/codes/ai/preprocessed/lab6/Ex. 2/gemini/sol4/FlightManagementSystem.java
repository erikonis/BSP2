import java.util.ArrayList;
import java.util.List;

public class FlightManagementSystem {
    private List<Flight> flights;
    private List<Passenger> passengers;
    private List<Pilot> pilots;
    private List<FlightCrewAssignment> crewAssignments;
    private List<FlightPassengerAssignment> passengerAssignments;

    public FlightManagementSystem() {
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.pilots = new ArrayList<>();
        this.crewAssignments = new ArrayList<>();
        this.passengerAssignments = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void assignPilotToFlight(Pilot pilot, Flight flight) {
        this.crewAssignments.add(new FlightCrewAssignment(flight, pilot));
        System.out.println(pilot.getName() + " assigned to " + flight.getNumber());
    }

    public void assignPassengerToFlight(Passenger passenger, Flight flight) {
        this.passengerAssignments.add(new FlightPassengerAssignment(flight, passenger));
        System.out.println(passenger.getName() + " booked on " + flight.getNumber());
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public List<FlightCrewAssignment> getCrewAssignmentsForFlight(Flight flight) {
        List<FlightCrewAssignment> assignments = new ArrayList<>();
        for (FlightCrewAssignment assignment : crewAssignments) {
            if (assignment.getFlight().equals(flight)) {
                assignments.add(assignment);
            }
        }
        return assignments;
    }

    public List<FlightPassengerAssignment> getPassengersForFlight(Flight flight) {
        List<FlightPassengerAssignment> assignments = new ArrayList<>();
        for (FlightPassengerAssignment assignment : passengerAssignments) {
            if (assignment.getFlight().equals(flight)) {
                assignments.add(assignment);
            }
        }
        return assignments;
    }

    public List<FlightPassengerAssignment> getFlightsForPassenger(Passenger passenger) {
        List<FlightPassengerAssignment> assignments = new ArrayList<>();
        for (FlightPassengerAssignment assignment : passengerAssignments) {
            if (assignment.getPassenger().equals(passenger)) {
                assignments.add(assignment);
            }
        }
        return assignments;
    }

    public List<FlightCrewAssignment> getFlightsForPilot(Pilot pilot) {
        List<FlightCrewAssignment> assignments = new ArrayList<>();
        for (FlightCrewAssignment assignment : crewAssignments) {
            if (assignment.getPilot().equals(pilot)) {
                assignments.add(assignment);
            }
        }
        return assignments;
    }

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

        // Create a flight management system
        FlightManagementSystem fms = new FlightManagementSystem();

        // Add flights, passengers, and pilots to the system
        fms.addFlight(lx123);
        fms.addFlight(lh456);
        fms.addFlight(af789);
        fms.addPassenger(alice);
        fms.addPassenger(bob);
        fms.addPassenger(charlie);
        fms.addPilot(david);
        fms.addPilot(eve);

        // Assign passengers and pilots to flights
        fms.assignPilotToFlight(david, lx123);
        fms.assignPilotToFlight(eve, lh456);
        fms.assignPassengerToFlight(alice, lx123);
        fms.assignPassengerToFlight(bob, lx123);
        fms.assignPassengerToFlight(bob, lh456);
        fms.assignPassengerToFlight(charlie, af789);

        // Demonstrate retrieving information
        System.out.println("\nFlights:");
        for (Flight flight : fms.getFlights()) {
            System.out.println(flight);
        }

        System.out.println("\nPassengers:");
        for (Passenger passenger : fms.getPassengers()) {
            System.out.println(passenger);
        }

        System.out.println("\nPilots:");
        for (Pilot pilot : fms.getPilots()) {
            System.out.println(pilot);
        }

        System.out.println("\nPilots on " + lx123.getNumber() + ":");
        for (FlightCrewAssignment assignment : fms.getCrewAssignmentsForFlight(lx123)) {
            System.out.println(assignment.getPilot());
        }

        System.out.println("\nPassengers on " + lx123.getNumber() + ":");
        for (FlightPassengerAssignment assignment : fms.getPassengersForFlight(lx123)) {
            System.out.println(assignment.getPassenger());
        }

        System.out.println("\nFlights for " + bob.getName() + ":");
        for (FlightPassengerAssignment assignment : fms.getFlightsForPassenger(bob)) {
            System.out.println(assignment.getFlight());
        }

        System.out.println("\nFlights for " + david.getName() + ":");
        for (FlightCrewAssignment assignment : fms.getFlightsForPilot(david)) {
            System.out.println(assignment.getFlight());
        }
    }
}