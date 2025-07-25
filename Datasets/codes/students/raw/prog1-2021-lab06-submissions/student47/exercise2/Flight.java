package lu.uni.programming1.lab6.exercise2;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;
    private Pilot pilot;
    private Pilot copilot;
    private Passenger[] passengers;
    
    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
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

    public Pilot getCopilot() {
        return copilot;
    }

    public void setCopilot(Pilot copilot) {
        this.copilot = copilot;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    
public String toString(){
    return "This is the log for flight number: " + number + "\n" + "This flight is headed from " + origin.getCity() + " in " + origin.getCountry() + " to " + destination.getCity() + " in " + destination.getCountry() + ".\n"
            + "The pilot is " + getPilot().getName() + ", and the co-pilot is " + getCopilot().getName() + ".\n" + "The passenger list consists of: " + passengers[0].getName() + ", " + passengers[1].getName() + ", " +  passengers[2].getName() + ".";
}


    
}
