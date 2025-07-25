public class Flight {
    private String number;
    private String AirportOrigin;
    private String AirportDestination;
    public Flight(String number, String airportOrigin, String airportDestination) {
        this.number = number;
        AirportOrigin = airportOrigin;
        AirportDestination = airportDestination;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAirportOrigin() {
        return AirportOrigin;
    }
    public void setAirportOrigin(String airportOrigin) {
        AirportOrigin = airportOrigin;
    }
    public String getAirportDestination() {
        return AirportDestination;
    }
    public void setAirportDestination(String airportDestination) {
        AirportDestination = airportDestination;
    }
    
}
