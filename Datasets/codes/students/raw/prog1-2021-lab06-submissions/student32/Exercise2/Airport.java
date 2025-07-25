package Exercise2;

import java.util.Scanner;

public class Airport {

    //I would say the class should manage it because it is logic that the airport control
    //who can fly and who will fly the plane
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("From where you want to start the flight? (first city then country): ");
        String cityStart = scanner.next();
        String countryStart = scanner.next();
        Airport start = new Airport(cityStart, countryStart, cityStart.substring(0,3).toUpperCase());
        System.out.println("Where do you want to fly? (first city then country): ");
        String cityEnd = scanner.next();
        String countryEnd = scanner.next();
        Airport end = new Airport(cityEnd, countryEnd, cityEnd.substring(0,3).toUpperCase());
        Flight f = new Flight(String.valueOf((int)(Math.random()*(9000-100+1) + 100)), start,end);
        System.out.println("How is your name? (firstname then lastname): ");
        String name = scanner.next();
        String passportName = name + " " + scanner.next();
        System.out.println("Passanger(1) or Pilot(2)?");
        int i = scanner.nextInt();
        switch(i){
            case 1-> {
                System.out.println("What is the number of your loyaltyCard?: ");
                Passenger passenger = new Passenger(name, passportName, scanner.nextInt());
                Pilot pilot = new Pilot("John", "John Doe", "Luxair");
                System.out.println("\n You are " + passenger.getName() +"\n Your passport name is "
                + passenger.getPassportName()+ "\n You have " + passenger.getLoyaltyCard() + " loyalty points");
                System.out.println("\n Your flight has the number " + f.getNumber() + "\n Start: " + f.getOrigin().city
                +" " + f.getOrigin().country + " " + f.getOrigin().getIataCode() 
                + "\n End: "  + f.getDestination().city+" " + f.getDestination().country + " " + f.getDestination().getIataCode());
                System.out.println("Your pilot is: " + pilot.getPassportName() + " from the airline " + pilot.getAirline());
            }
            case 2-> {
                System.out.println("What is the name of your airline?: ");
                Pilot pilot = new Pilot(name,passportName, scanner.next());
                System.out.println("\n You are " + pilot.getName() +"\n Your passport name is "
                + pilot.getPassportName());
                System.out.println("\n Your flight has the number " + f.getNumber() + "\n Start: " + f.getOrigin().city
                +" " + f.getOrigin().country + " " + f.getOrigin().getIataCode() 
                + "\n End: "  + f.getDestination().city+" " + f.getDestination().country + " " + f.getDestination().getIataCode());
               
            }
            default-> System.out.println("Unvalid input please try again.");

        };

        //close
        scanner.close();     
    }
    //attribues

    private String city;
    private String country;
    private String iataCode;
    

    //methodes

    public Airport(String city, String country, String iataCode) {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIataCode() {
        return iataCode;
    }
  
}
