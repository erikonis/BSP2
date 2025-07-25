public class AirTravel {
    public static void main(String[] args) {
        Airport airportstart = new Airport("Findel", "Luxembourg", "0516161534");
        Airport airportdest = new Airport("Paris", "France", "0516161534");
        Person info = new Person("Alex", "6486464");
        Pilot infoPilot = new Pilot("Bob", "64646489", "Air France");

        System.out.println("The start airport is: " + airportstart.getCity());
        System.out.println("The dest airport is: " + airportdest.getCity());
        System.out.println("The passenger name is : " + info.getName() + " and the passportId is " + info.getPassportNumber());
        System.out.println("The Pilot is from the airline: " + infoPilot.getAirline() + " and the name of the Pilot is " + infoPilot.getName());
    }
}
