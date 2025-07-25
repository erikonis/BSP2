package lu.uni.programming1.lab6.exercise2;

public class MainAirTravel {
    
    public static void main(String[] args) {

        int loyaltyCardNumber=0;
        
    //Create an aeroport
        Airport CDG = new Airport("Paris", "France", "CDG");
        Airport Heathrow = new Airport("London", "United-Kingdom", "LHR");

    //Create a flight
        Flight CDGtoLondon = new Flight("BA1456",CDG,Heathrow);
    
    //Create passengers
        Passenger Marion = new Passenger("Marion Salaün", "passportNumber", loyaltyCardNumber);
        Passenger Ryan = new Passenger("Ryan Gosling", "passportNumber", loyaltyCardNumber);
       
    //Create two pilots
        Pilot Doctor = new Pilot("Doctor Who","passportNumber", "British Airways");
        Pilot Chuck = new Pilot("Chuck Norris","passportNumber", "American Airlines");

   
    // Boarding pass
        System.out.println("\n Passengers are : "+ Marion + Ryan);
        System.out.println("\n Pilots are :" + Doctor + Chuck);
      
    //Information about the flight
        System.out.println("\n Resume of flight :" + CDGtoLondon + "\n");
    


    }
    

}
