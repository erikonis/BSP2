public class Airport {

    private String city;

    private String country;

    private String iataCode;

    private static int number = 1;

    public Airport(String city, String country, String iataCode) {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIataCode() {
        return iataCode;
    }

    private String flightNumber() {
        return Integer.toString(number++);
    }

    public Flight flyTo(Airport destination, Passenger passenger, Pilot pilot) {
        Flight flight = new Flight(flightNumber(), this, destination);
        return flight;
    }
    
}
