public class Launcher {
    public static void main(String[] args) {
        Airport airportFrom = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport airportTo = new Airport("Ottawa", "Canada", "YOW");
        Flight flight = new Flight("LU2233", airportFrom, airportTo);
        Passenger passenger = new Passenger("Baseer", "BS1994", 833429);
        Pilot pilot = new Pilot("Chris", "ABC567", "LUXAIR");
        Person person1 = new Person("Baseer", "BS1994");
        Person person2 = new Person("SAADAT", "ABC9876");
        Manage manage = new Manage(airportFrom, airportTo, flight, passenger, person1, person2, pilot);
        manage.operate();
    }
}