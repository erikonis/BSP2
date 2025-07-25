public class Launcher {
    public static void main(String[] args) {
        Airport airport1 = new Airport("LUX Airport", "(LUX)", "LUX");
        Airport airport2 = new Airport("John F. Kennedy International Airport", "(USA)", "JFK");
        Flight flight = new Flight("LG822", airport1, airport2);
        Passenger passenger = new Passenger("Prime Minister", "DU6CB9LX", 5544);
        Pilot pilot = new Pilot("Captain Neil Armstrong", "US8CB43G", "Luxair");
        Person person1 = new Person("Prime Minister", "DU6CB9LX");
        Person person2 = new Person("Neil Armstrong", "US8CB43G");

        LuxAirManagement managementDepartment = new LuxAirManagement(airport1, airport2, flight, passenger, person1, person2, pilot);

        managementDepartment.managementDepartment();

    }
}
