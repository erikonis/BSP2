public class LuxAirManagement {
        // Initializing
        Airport airport1, airport2;
        Flight flight;
        Passenger passenger;
        Person person1, person2;
        Pilot pilot;
        String departureTime = "12:45 PM"; // Put fixed time because on ticket it's already printed (optional)
        String arrivalTime = "06:50 AM";

        public LuxAirManagement(Airport airport1, Airport airport2, Flight flight, Passenger passenger, Person person1,
                        Person person2, Pilot pilot) {
                this.airport1 = airport1;
                this.airport2 = airport2;
                this.flight = flight;
                this.passenger = passenger;
                this.person1 = person1;
                this.person2 = person2;
                this.pilot = pilot;
        }

        public void managementDepartment() {
                // Not sure would need to print all of the information but did to see it works
                System.out.println("\nPassenger Name: " + passenger.getName() + " | PassportNu: "
                                + passenger.getPassportNumber() + " | Loyal Card Number: "
                                + passenger.getLoyaltyCardNumber());
                System.out.println("Flight Number: " + flight.getNumber() + " \nFrom: " + airport1.getCity() + " \nTo: "
                                + airport2.getCity());

                System.out.println("Departure: " + airport1.getCity() + " | " + airport1.getCountry() + " | "
                                + airport1.getIataCode() + " | " + departureTime);
                System.out.println("Arrival: " + airport2.getCity() + " | " + airport2.getCountry() + " | "
                                + airport2.getIataCode() + " | " + arrivalTime);
                System.out.println("Pilot of this flight is: " + pilot.getName() + " | Airline: " + pilot.getAirline());

                System.out.println("People on board: " + person1.getName() + " | PassportNum: "
                                + person1.getPassportNumber());
                System.out.println("People on board: " + person2.getName() + " | PassportNum: "
                                + person2.getPassportNumber() + "\n");

        }
}
