package Exercises.exercise2;

public class Pilot extends Person{
    private String airline;

    public Pilot(String name, String passporNumber, String airline) {
        super(name, passporNumber);
        super.setPilot(true);
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
    

    
}
