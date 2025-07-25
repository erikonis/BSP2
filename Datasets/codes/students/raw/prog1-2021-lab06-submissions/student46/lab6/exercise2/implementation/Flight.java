package lab6.exercise2.implementation;

import java.util.ArrayList;

public class Flight {

    private String number;
    private Airport origin;
    private Airport destination;

    private Pilot pilot;
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public Flight(String number, Airport origin, Airport destination, Pilot pilot, ArrayList<Passenger> passengers) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.pilot = pilot;
        this.passengers = passengers;
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
        
    public void addPassenger(Passenger e) {
        passengers.add(e);
    }
    
    public void setPilot(Pilot pilot)
    {
        this.pilot = pilot;
    }

    @Override
    public String toString()
    {
        String output = "\nFlight number : \t"+number+"\nPilot name : \t\t"+pilot.getName()+"\nFlight origin : \t"+origin.getCity()+"\nFlight destination : \t"+destination.getCity()+"\n\n-Passengers of the flight : \n";
        for(Passenger x: passengers)
        {
            output += "\n\t"+x.getName();
        }
        output +="\n";
        return output;
    }
}
