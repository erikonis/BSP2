package lu.uni.programming1.lab6.exercise2;

import java.util.Arrays;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;
    private Passenger[] passengers;
    private Pilot[] pilots;
    private int index;
    private int index2;



    public Flight(String number_, Airport origin_, Airport destination_, Passenger[] passengers_, Pilot[] pilots_) {
		this.number = number_;
		this.origin = origin_;
        this.destination = destination_;
        this.passengers = passengers_;
        this.pilots = pilots_;
        this.index = 0;
	}

    public void addpassenger(Passenger pas_) {
        if (index < passengers.length){
            passengers[index] = pas_;
            index ++;
        }
    }

    public void addpilots(Pilot pil_) {
        if (index2 < pilots.length){
            pilots[index2] = pil_;
            index2 ++;
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

    
    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }



    public Pilot[] getPilots() {
        return pilots;
    }

    public void setPilots(Pilot[] pilots) {
        this.pilots = pilots;
    }

    @Override
    public String toString() {

        String PassengerList = " ";
		for (int i = 0 ; i < getPassengers().length ; i++){
			PassengerList += getPassengers()[i].getName()+ " ";
		}

        String PilotsList = " ";
		for (int j = 0 ; j < getPilots().length ; j++){
			PilotsList += getPilots()[j].getName()+ " ";
		}

        return "Flight number: " + getNumber() + "\nDestination: " + getDestination() + "\nOrigin: " +  getOrigin() + "\nPassengers:" + PassengerList + "\nPilots: " + PilotsList;
    }

    
    
}
