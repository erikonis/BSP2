public class Flight {
    private String number;
    private Airport origin, destination;
    private Pilot pilot, coPilot;
    private Passenger[] passengerList;
    private int counter = 0;

    public Flight(String number, Airport origin, Airport destination,int length, Pilot pilot, Pilot coPilot) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.pilot = pilot;
        this.coPilot = coPilot;
        passengerList = new Passenger[length];
    }

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

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Pilot getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(Pilot coPilot) {
        this.coPilot = coPilot;
    }

    public void addPassenger(Passenger p){
        if(counter<passengerList.length){
            passengerList[counter] = p;
            counter++;
        }
    }

    public String toString(){
        String text = "Welcome aboard flight number "+number+" from "+origin+" to "+destination+"! On board are: \n";
        text+= pilot.toString()+"\n";
        text+= coPilot.toString()+"\n";
        for(int i=0;i<counter;i++){
            text+= passengerList[i].toString()+"\n";
        }
        return text;
    }

    public void removeAll(){
        passengerList=null;
        coPilot=null;
        pilot=null;
    }
}
