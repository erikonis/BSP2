public class Passenger extends Person{
    int loyaltyCardNumber;

    public Passenger(String name, String passportNumber,int loyaltyCardNumber) {
        super(name,passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }
    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }
    
    @Override
    public void fly(Flight flight){
        System.out.println("Passport Number: "+passportNumber);
        System.out.println("Loyalty Card Number: "+loyaltyCardNumber);
        System.out.println(name+" is currently in the Airport located in: "+flight.getOrigin().getCity()+", "+flight.getOrigin().getCountry()+", "+flight.getOrigin().getIataCode());
        System.out.println(name+" is taking the flight :"+flight.getNumber());
        System.out.println(name+" is going to :"+flight.getDestination().getCity()+", "+flight.getDestination().getCountry()+", "+flight.getDestination().getIataCode());
        
    }
}
