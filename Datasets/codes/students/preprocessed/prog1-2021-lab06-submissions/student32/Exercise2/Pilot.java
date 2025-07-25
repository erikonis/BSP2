public class Pilot extends Person{

    //attribues

    private String airline;

    //methodes

    public Pilot(String name, String passportName, String airline) {
        super(name, passportName);
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    
    
}
