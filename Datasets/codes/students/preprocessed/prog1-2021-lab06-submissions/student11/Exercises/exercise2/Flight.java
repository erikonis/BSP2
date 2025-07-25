public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;
    private Person persons[];
    private int pilot = 0;
   

    public Flight(String number, Airport origin, Airport destination, int allseats) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        persons = new Person[allseats];
    }

    public void addPassenger(String name, String passporNumber, int loyaltyCardNumber, int pos) {

        Passenger passenger = new Passenger(name, passporNumber,loyaltyCardNumber);
        persons[pos] = passenger;

    }

    public void addPilot(String name, String passporNumber, String airline,int pos) {

        if(pilot<2)
        {
            Pilot pilot = new Pilot(name, passporNumber, airline);
            persons[pos]=pilot;
        }
        else
        {
            System.out.println("There are enough pliots on the plane");
        }
        
        
       

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

}
