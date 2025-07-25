public class Flight {

    private String number;
    private Airport origin;
    private Airport destination;
    private Passenger[] passList;
    private Pilot[] pilotList;

    String passnames = "";
    String pilotnames = "";
    String airline = "";

    public Flight(String number, Airport origin, Airport destination, Passenger[] passList, Pilot[] pilotList) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.passList = passList;
        this.pilotList = pilotList;
        passNames();
        pilotNames();
        airline();
        

    }

    public String getNumber() {
        return number;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public void passNames() {
        for (int i = 0; i < passList.length; i++) {

            if (passList[i] != null) {
                passnames += passList[i].getName();
            }
        }

    }

    public void pilotNames() {
        for (int i = 0; i < pilotList.length; i++) {

            if (pilotList[i] != null) {
                pilotnames += pilotList[i].getName();
            }
        }

    }

    public void airline() {
        airline = pilotList[0].getAirline();
    }

    @Override
    public String toString() {
        return "Airline: " + airline + "\n" + "Flight Number: " + number + "\n" + "Local airport: " + origin + "\n"
                + "Destination: " + destination + "\n" + "Pilot names: " + pilotnames + "\n" + "Passenger List: "
                + passnames;
    }

}
