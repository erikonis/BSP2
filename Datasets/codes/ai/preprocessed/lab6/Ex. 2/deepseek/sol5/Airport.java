public class Airport {
    private final String city;
    private final String country;
    private final String iataCode;

    public Airport(String city, String country, String iataCode) {
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty");
        }
        if (country == null || country.trim().isEmpty()) {
            throw new IllegalArgumentException("Country cannot be null or empty");
        }
        if (iataCode == null || iataCode.length() != 3) {
            throw new IllegalArgumentException("IATA code must be exactly 3 characters");
        }

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
        return iataCode + " - " + city + ", " + country;
    }
}