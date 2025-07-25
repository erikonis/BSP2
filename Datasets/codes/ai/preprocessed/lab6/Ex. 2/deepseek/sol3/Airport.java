public class Airport {
    private final String city;
    private final String country;
    private final String iataCode;

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

    @Override
    public String toString() {
        return iataCode + " (" + city + ", " + country + ")";
    }
}