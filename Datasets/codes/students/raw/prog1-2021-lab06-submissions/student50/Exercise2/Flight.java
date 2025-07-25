package Exercise2;

public class Flight {
    private String number;
    private Airport origin,destination;
    private Passenger p[]= new Passenger[300];
    private Pilot pilot;
    private int passc=0;

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
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

    public void addPassenger(Passenger p)
    {if(passc<300)
        this.p[passc++]=p;
    else System.out.println("Maximum number of passengers permitted for this flight! Sorry");
    }

    @Override
    public String toString() {
        String passn="";
        for(int i=0;i<passc;i++)
        passn=passn+p[i].toString()+"\n";

        return"**"+ number + ": to " + destination +  " from " + origin + "\n *List of passengers: \n"
                + passn + "*Pilot:" + pilot+"\n";   }
    
    
    
    
}
