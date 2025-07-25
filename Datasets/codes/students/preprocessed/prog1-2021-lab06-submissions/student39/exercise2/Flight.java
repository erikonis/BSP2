public class Flight {
    private String number;
    private Airport origin, destination;
    private Pilot pil;
    private boolean p;
    Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        p=false;}
        //sets up a number of variables for a flight, notably a number, origin and destinatiion
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Airport getOrigin() {
        return origin;
    }
    public void setOrigin(Airport origin) {
        this.origin = origin;
    }
    public Airport getDestination() {
        return destination;
    }
    public void setDestination(Airport destination) {
        this.destination = destination;
    }
    //setters and getters
    public void setPilot(Pilot pil){
        this.pil=pil;
        p=true;}
        //setter for the pilot of a flight, used in the Pilot class
    public String getPilot(){
        if(p){
            return pil.getName();}
        else{return "unknown Pilot";}}
        //unless the pilot has been set in a Pilot class instance, with an unknown pilot in case none was set
}
