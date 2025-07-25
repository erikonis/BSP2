public class Pilot extends Person{
    String airline;

    public Pilot(String name, String passportNumber,String airline) {
        super(name,passportNumber);
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public void fly(Flight flight){
        System.out.println("Passport Number: "+passportNumber);
        System.out.println("Airline: "+airline);
        System.out.println(name+" is currently in the Airport located in: "+flight.getOrigin().getCity()+", "+flight.getOrigin().getCountry()+", "+flight.getOrigin().getIataCode());
        System.out.println(name+" is taking the flight :"+flight.getNumber());
        System.out.println(name+" is going to :"+flight.getDestination().getCity()+", "+flight.getDestination().getCountry()+", "+flight.getDestination().getIataCode());
        
    }
}
