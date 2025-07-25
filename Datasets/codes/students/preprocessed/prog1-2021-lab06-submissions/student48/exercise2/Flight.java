import java.util.ArrayList;

/*
For a single flight i would add two method addPassenger and addPilot
and an ArrayList onBoard that tracks every person on board including Pilots and Passengers.
Disadvantage of this implementation is that you need to create new Pilots and Passengers for every new flight. 
To avoid this you could create a new Class Flights, which could create a set of flights.
The advantage of this is that you wouldn't need to create new passengers and pilots vor every flight but could add the same people 
to different flights and therefor more flexibility is possible.
*/

public class Flight {
    private String number;
    private Airport origin, destination;
    private ArrayList<Person> onBoard = new ArrayList<>();

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
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

    // Ads a passenger to the flight
    public void addPassenger(String name, String passportNumber){
        Passenger passenger = new Passenger(name, passportNumber);
        onBoard.add(passenger);
    }

    // Ads a pilot to the flight
    public void addPilot(String name, String passportNumber, String airline){
        Pilot pilot = new Pilot(name, passportNumber, airline);
        onBoard.add(pilot);
    }

    // Return a string with everyone onboard
    public String showOnBoard(){
        String s = "";
        for(int i=0; i<onBoard.size(); i++){
            s += "\n" + onBoard.get(i).toString();
        }
        return s;
    }

    @Override
    public String toString() {
        return  "\n\t--Flightnumber: " + number + "--" + 
                "\nFrom: " + origin.toString() + 
                "\nTo: " + destination.toString() + "\n" +
                showOnBoard();
    }
}
