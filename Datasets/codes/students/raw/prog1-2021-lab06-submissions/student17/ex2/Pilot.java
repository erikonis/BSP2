package ex2;
public class Pilot extends Person{
    private String airline;

    public Pilot(String airline, String name, String passportNumber) {
        super (name, passportNumber);
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    @Override
    public String toString() {
        System.out.println("Pilot: " + super.getName());
        System.out.println("Airline: " + airline);
        return "The passportnumber: " + super.getPassportNumber();
    }
    
    
}