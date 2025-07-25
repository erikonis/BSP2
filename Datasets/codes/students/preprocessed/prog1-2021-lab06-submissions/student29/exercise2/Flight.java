public class Flight {

    private String number;

    private Airport origin;

    private Airport destination;

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

    public String toString(Passenger passenger, Pilot pilot){
        return "Origin of flight: " + origin.getCity() + ", " + origin.getCountry() + "\nTo: " + destination.getCity() + ", " + destination.getCountry() + "\nPilot: " + pilot.getName() + "\nPassenger: " + passenger.getName() + "\nAirline: " + pilot.getAirline() + "\nFlight number: " + number;
    }
    
}
