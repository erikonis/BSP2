public class Flight { //test
    private String number;
    private Airport origin, destination;

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

    public void flightParticipation(Person person){ //writes a different message for Pilot and Passenger
                                                    //but doesn't accept any other Person
        if(person instanceof Passenger){            //(If an other class extending person is created the method has to be modified)
            System.out.println(person.getName()+ " is a passenger in the flight number" + getNumber());
        }
        else if(person instanceof Pilot){
            System.out.println(person.getName()+ "is the pilot of the flight number " + getNumber());
        }
    }
}
