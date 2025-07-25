import java.util.ArrayList;

public class Launch {
    private static Airport Lisbon = new Airport("Lisbon", "Portugal", "LIS");
    private static Airport Madrid = new Airport("Madrid", "Spain", "MAD");
    private static Airport Luxembourg = new Airport("Luxembourg", "Findel", "LUX");

    private static Pilot pilot1 = new Pilot("Hernandez","123","Air Madrid");
    private static Pilot pilot2 = new Pilot("David","321","Air Madrid");

    private static ArrayList<Passenger> passengerList = new ArrayList<>();

    public static void main(String[] args) {
        passengerList.add(new Passenger("Mike","123",123));
        passengerList.add(new Passenger("John","123",123));
        passengerList.add(new Passenger("Patrick","123",123));

        Flight[] flightsMadrid = {new Flight("123", Madrid, Luxembourg, pilot1, passengerList),new Flight("321", Madrid, Lisbon, pilot2, passengerList)};

        Madrid.addFlights(flightsMadrid);
        System.out.println(Madrid.toString());
    }
}
