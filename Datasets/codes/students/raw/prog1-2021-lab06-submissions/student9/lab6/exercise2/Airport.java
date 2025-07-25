public class Airport {
    String country,city,iataCode;

    public Airport(String country, String city, String iataCode) {
        this.country = country;
        this.city = city;
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

}
