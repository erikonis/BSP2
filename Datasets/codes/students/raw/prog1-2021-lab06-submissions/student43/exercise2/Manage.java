package lu.uni.programming1.lab6.exercise2;

public class Manage {
        Airport airportFrom, airportTo;
        Flight flight;
        Passenger passenger;
        Person person1, person2;
        Pilot pilot;

        public Manage(Airport airportFrom, Airport airportTo, Flight flight, Passenger passenger, Person person1,
                        Person person2, Pilot pilot) {
                this.airportFrom = airportFrom;
                this.airportTo = airportTo;
                this.flight = flight;
                this.passenger = passenger;
                this.person1 = person1;
                this.person2 = person2;
                this.pilot = pilot;
        }

        public void operate() {
                System.out.println("Flight number:\n" + flight.getNumber() + "\n" + "\nJourney:\n"
                                + airportFrom.getCity() + " / " + airportTo.getCity());
                System.out.println("\nFrom:\n" + airportFrom.getCity() + " / " + airportFrom.getCountry() + " / "
                                + airportFrom.getIataCode());
                System.out.println("\nDestination:\n" + airportTo.getCity() + " / " + airportTo.getIataCode() + " / "
                                + airportTo.getCountry());
                System.out.println(
                                "\nPassenger:\n" + person1.getName() + "\nPassport no:\n" + person1.getPassportNumber()
                                                + "\nLoyalty Card No:\n" + passenger.getLoyaltyCardNumber() + "\n");
                System.out.println(
                                "\nPassenger:\n" + person2.getName() + "\nPassport no:\n" + person2.getPassportNumber()
                                                + "\nLoyalty Card No:\n" + passenger.getLoyaltyCardNumber() + "\n");
                System.out.println("\nPilot name:\n" + pilot.getName() + "\nPassport no:\n" + pilot.getPassportNumber()
                                + "\nAirline:\n" + pilot.getAirline() + "\n");
        }
}