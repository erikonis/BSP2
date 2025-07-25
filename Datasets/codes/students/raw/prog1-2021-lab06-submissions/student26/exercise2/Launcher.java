package exercise2;

public class Launcher {
    public static void main(String[] args) {
        Airport origin = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport destination = new Airport("Rome", "Italy", "FCO");
        Flight flight = new Flight("LG123", origin, destination);
        Person p1 = new Person("Alex", "VMQ17WQEY");
        Person p2 = new Person("Lisa", "BXY18ERPM");
        Pilot pilot = new Pilot("Alex", "VMQ17WQEY", "Luxair");
        Passenger passenger = new Passenger("Lisa", "BXY18ERPM", 1614434568);
        IManageAll iManageAll = new IManageAll(origin, destination, flight, p1, p2, pilot, passenger);

        System.out.println(iManageAll.ManageAll());
    }
}
