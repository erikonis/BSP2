public class Pilot extends Person {
    
    private String airline;

    public Pilot(String name, String passportNumber, String airline){
        super(name, passportNumber);
        this.airline=airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
            return " \n ---- Boarding Pass ---- \n "
                    + name + " is on board. \n Passport Number : "
                    + passportNumber
                    + "\n Pilot for : "
                    + airline;
    }

}
