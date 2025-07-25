package lu.uni.programming.Lab6.exercise2;

public class Pilot extends Person{
    private String airline;

    public Pilot(String name, String passeportNumber, String airline) {
        super(name, passeportNumber);
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }    
}
