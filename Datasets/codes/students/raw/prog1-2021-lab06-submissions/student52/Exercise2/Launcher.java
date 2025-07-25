package lu.uni.programming1.lab6.Exercise2;

public class Launcher {
    public static void main(String[] args) {
        
        Passenger passenger = new Passenger(68364, "TMRI7925", "Tom Riddle");
        Pilot pilot = new Pilot("American Air", "Harry Potter", "HP6574");
        Airport airport1 = new Airport("Los Angeles", "USA", "LAX");
        Airport airport2 = new Airport("New York", "USA", "JFK");
        Flight flight = new Flight("LA254", airport1, airport2);
        Person p1 = passenger;
        Person p2 = pilot;
        FlightHandler flightHandler = new FlightHandler(flight, p1, p2, "Lisa Zanier");

        System.out.println(flightHandler);

    }
}
