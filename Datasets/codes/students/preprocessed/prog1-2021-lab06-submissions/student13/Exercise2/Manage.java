public class Manage {
    Airport airport1, airport2;
    Flight flight;
    Passenger passenger;
    Person person1, person2;
    Pilot pilot;

    public Manage(Airport airport1, Airport airport2, Flight flight, Passenger passenger, Person person1,
            Person person2, Pilot pilot) {
        this.airport1 = airport1;
        this.airport2 = airport2;
        this.flight = flight;
        this.passenger = passenger;
        this.person1 = person1;
        this.person2 = person2;
        this.pilot = pilot;
    }

    public void manage() {
        System.out.println(
                "Destination\n" + flight.getNumber() + " / " + airport1.getCity() + " / " + airport2.getCity());
        System.out.println(
                "\nFrom:\n" + airport1.getCity() + " / " + airport1.getCountry() + " / " + airport1.getIataCode());
        System.out
                .println("\nTo:\n" + airport2.getCity() + " / " + airport2.getCountry() + " / " + airport2.getIataCode());
        System.out.println("\nPassenger name:\n" + person1.getName() + "\nPassport no:\n" + person1.getPassportNumber()
                + "\nLoyalty card no:\n" + passenger.getLoyaltyCardNumber());
        System.out.println("\nPassenger name:\n" + person2.getName() + "\nPassport no:\n" + person2.getPassportNumber()
                + "\nLoyalty card no\n" + passenger.getLoyaltyCardNumber());
        System.out.println("\nPilot name:\n " + pilot.getName() + "\nPassport no:\n" + pilot.getPassportNumber()
                + "\nAirline:\n" + pilot.getAirline());
    }
}
