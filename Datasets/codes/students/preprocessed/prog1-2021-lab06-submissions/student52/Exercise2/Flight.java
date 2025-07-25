public class Flight {
    
    private String number;
    Airport origin;
    Airport destination;
    
    
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

  Flight(){}

@Override
public String toString() {
    return "\nFlight number: "+number+"\nFlight origin: "+origin+"\nFlight destination: "+destination;//returns airport instance
}
  
    
}
