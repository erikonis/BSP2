package lab6.exercise2.implementation;

public class Pilot extends Person{

    String airline;

    public Pilot(String name, String passportNumber, String airline) {
        super(name, passportNumber);
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    
}
