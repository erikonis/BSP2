public class Airport {
    private final String city;
    private final String country;
    private final String iataCode;

    public Airport(String city, String country, String iataCode) {
        validateParameters(city, country, iataCode);
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
    }

    private void validateParameters(String city, String country, String iataCode) {
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("City cannot be null or blank");
        }
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country cannot be null or blank");
        }
        if (iataCode == null || iataCode.length() != 3) {
            throw new IllegalArgumentException("IATA code must be 3 characters");
        }
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