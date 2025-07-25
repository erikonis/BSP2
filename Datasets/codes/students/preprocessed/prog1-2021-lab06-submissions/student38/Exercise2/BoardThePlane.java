
// Ex2.2 - The Class BoardThePlane is basically an abstract representation of the Pilot and the Passengers boarding the Plane 

public class BoardThePlane extends Flight {


    Flight the; 
    Pilot pilot; Passenger[] passengers;



    public BoardThePlane (String number , Airport origin, Airport destination, Pilot pilot, Passenger[] passengers) {
        //super(boardFlight.number, boardFlight.origin, boardFlight.destination);
        super(number, origin, destination);
        this.pilot=pilot; 
        this.passengers=passengers;

    }





    

    
}
