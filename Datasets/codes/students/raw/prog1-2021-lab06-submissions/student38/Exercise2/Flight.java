package Exercise2;

public class Flight {

    String number;
    Airport origin;
    Airport destination;


    public Flight(String number, Airport origin, Airport destination) { 

        this.number= number;
        this.origin =origin; 
        this.destination=destination;

    }


    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Airport getOrigin() {
        return this.origin;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public Airport getDestination() {
        return this.destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }
    

}
