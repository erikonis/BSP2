package lu.uni.programming1.lab6.exercise2;

public class Flight {
    private String number;
    Airport origin;
    Airport destination;
    Passenger[] passengers;
    Pilot pilot;

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public Flight(String number, Airport origin, Airport destination, Passenger[] passengers, Pilot pilot) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.passengers = passengers;
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

    public Passenger[] getPassengers() {
        return passengers;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
    
    @Override
    public String toString() {
        if (pilot != null) {
            return "Flight nr: " + number + " from " + origin + " to " + destination + " with " + passengers.length + " passenger and " + pilot + " as pilot.";
        } else {
            return "Flight nr: " + number + " from " + origin + " to " + destination;
        }
    }

}
