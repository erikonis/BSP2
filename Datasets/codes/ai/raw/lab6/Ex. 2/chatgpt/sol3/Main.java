public class Main {
    public static void main(String[] args) {
        // 1. Create airports
        Airport lux = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport fra = new Airport("Frankfurt", "Germany", "FRA");
        Airport nyc = new Airport("New York", "USA", "JFK");

        // 2. Create flights
        Flight f1 = new Flight("LG100", lux, fra);
        Flight f2 = new Flight("LG200", fra, nyc);

        // 3. Create people
        Pilot pilotAlice = new Pilot("Alice Rider", "P1234567", "LuxAir");
        Passenger paxBob   = new Passenger("Bob Traveler", "X7654321", 1001);
        Passenger paxCarol = new Passenger("Carol Jetset", "Y1122334", 1002);

        // 4. Assign pilot and passengers
        f1.assignPilot(pilotAlice);
        f1.addPassenger(paxBob);
        f1.addPassenger(paxCarol);

        // 5. Print out
        System.out.println(f1);
        System.out.println("----");

        // 6. Another flight without a pilot yet
        System.out.println(f2);
    }
}
