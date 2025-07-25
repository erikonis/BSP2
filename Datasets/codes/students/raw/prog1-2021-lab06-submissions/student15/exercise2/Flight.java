package exercise2;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;

    public Flight(String number, Airport origin, Airport destination){
        this.setNumber(number);
        this.setOrigin(origin);
        this.setDestination(destination);
       
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
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

    public String toString() {
        return "\nAiport of departure: "+origin.toString()+"\nAirport of arrival: "+destination.toString();
    }
}
