public class Launcher {
    public static void main(String[] args) {
        Airport airport1 = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport airport2 = new Airport("Germany", "Berlin", " Willy-Brandt");
        Flight flight = new Flight("LG22", airport1, airport2);
        Passenger passenger = new Passenger("Cristoph", "LU5565", 2021);
        Pilot pilot = new Pilot("Elder", "Ge8957", "LUXAIR");
        Person person1 = new Person("Cristoph", "LU5565");
        Person person2 = new Person("Rafi", "Ge8957");

        Manage manage = new Manage(airport1, airport2, flight, passenger, person1, person2, pilot);

        manage.manage();

    }
}
