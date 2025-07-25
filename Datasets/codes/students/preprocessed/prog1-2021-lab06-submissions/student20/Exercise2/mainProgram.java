public class mainProgram {

    public static void main(String[] args) {


    Pilot pilot1 = new Pilot("Jean-Pierre Apfel","Y56739U81","Luxair");
    
   
    int loyalityCardNumber = 56789;

    Passenger passenger1 = new Passenger("John Doe","A327838Z6",loyalityCardNumber);


    Airport airport1 = new Airport("Los Angeles","USA","Lax");

    Airport airport2 = new Airport("Luxembourg","Luxembourg","Lux");


    Flight flight1 = new Flight("WN417", airport1, airport2);


    System.out.println("\tWelcome to your flight with "+pilot1.getAirline()+" "+passenger1.getName());
    System.out.println("Passport number: "+passenger1.getPassportNumber());
    System.out.println("Loyalitycard number: "+passenger1.getLoyalityCardNumber());
    System.out.println("----------------------------------------------------");
    System.out.println("Your flight number: "+flight1.getNumber());
    System.out.println("Origin: "+ airport1.getCountry());
    System.out.println("Destination: "+airport2.getCountry());
    System.out.println("Your pilot for this flight is: "+pilot1.getName());






        
    }
    
}
