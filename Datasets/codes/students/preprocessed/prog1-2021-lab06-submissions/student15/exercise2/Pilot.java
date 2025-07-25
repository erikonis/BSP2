public class Pilot extends Person{
    private String airline;

    //public Pilot(String name, String passportNumber, String airline) {

    //}
    public Pilot(String name, String passportNumber, Flight flight, String airline){
        super(name, passportNumber, flight);
        //this.setAirline(airline);
        this.airline =airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "\n\t-Pilot-"+super.toString()+"\nAirline: " + getAirline();
    }
}
