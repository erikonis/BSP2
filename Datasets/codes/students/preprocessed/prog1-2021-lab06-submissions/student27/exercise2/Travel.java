import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many planes fligh today?");
        int numberOfPlanes = scanner.nextInt();
        int pilotsInt = 0;
        int numberOfPeople2 = 0;

        Flight[] flights = new Flight[numberOfPlanes];

        int newFlights = 0;
        while (newFlights < numberOfPlanes) {
            Airport start = new Airport("", "", "");
            Airport end = new Airport("", "", "");
            String numberOfPeople1 = "0";

            System.out.println("How many people are on the plane?");
            numberOfPeople1 = scanner.next();
            numberOfPeople2 = Integer.valueOf(numberOfPeople1);

            System.out.println("How many of them are pilots?");
            pilotsInt = scanner.nextInt();

            Pilot[] pilots = new Pilot[pilotsInt];
            Passenger[] passengers = new Passenger[(numberOfPeople2 - pilotsInt)];

            for (int i = 0; i < pilotsInt; i++) {
                System.out.println("The name of the pilot: ");
                String name = scanner.next();

                System.out.println("The passportnumber of the pilot: ");
                String passportNumber = scanner.next();

                System.out.println("The airline for that the pilot works: ");
                String airline = scanner.next();

                pilots[i] = new Pilot(name, passportNumber, airline);
            }

            for (int i = 0; i < (numberOfPeople2 - pilotsInt); i++) {
                System.out.println("The name of the passenger: ");
                String name = scanner.next();

                System.out.println("The passportnumber of the passenger: ");
                String passportNumber = scanner.next();

                System.out.println("The LoyalityCardNumber of the passenger: ");
                int loyalityCardNumber = scanner.nextInt();

                passengers[i] = new Passenger(name, passportNumber, loyalityCardNumber);
            }

            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    System.out.println("Where does the plane start:");
                } else {
                    System.out.println("Where does the plane land:");
                }

                System.out.println("Please tell the country?");
                String country = scanner.next();

                System.out.println("Please tell the city?");
                String city = scanner.next();

                System.out.println("Please give the iatacode?");
                String iataCode = scanner.next();

                if (i == 0) {
                    start = new Airport(city, country, iataCode);
                } else {
                    end = new Airport(city, country, iataCode);
                }
            }

            flights[newFlights] = new Flight(numberOfPeople1, start, end);

            newFlights = newFlights + 1;

            if (newFlights == numberOfPlanes) {
                for (int i = 0; i < numberOfPlanes; i++) {
                    System.out.println(flights[i].toString());
                    for (int j = 0; j < pilotsInt; j++) {
                        System.out.println(pilots[j].toString());
                    }
                    for (int k = 0; k < (numberOfPeople2 - pilotsInt); k++) {
                        System.out.println(passengers[k].toString());
                    }
                }
            }
        }

        scanner.close();
    }
}
