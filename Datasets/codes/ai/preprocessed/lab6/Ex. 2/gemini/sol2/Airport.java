import java.util.Objects;

public class Airport {
    private final String city;
    private final String country;
    private final String iataCode;

    public Airport(String city, String country, String iataCode) {
        this.city = Objects.requireNonNull(city, "City cannot be null");
        this.country = Objects.requireNonNull(country, "Country cannot be null");
        this.iataCode = validateIataCode(iataCode);
    }

    private String validateIataCode(String iataCode) {
        if (iataCode == null || iataCode.length() != 3) {
            throw new IllegalArgumentException("IATA code must be 3 characters long (was " + iataCode + ")");
        }
        return iataCode.toUpperCase(); // Store IATA codes in uppercase for consistency
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(iataCode, airport.iataCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iataCode);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", iataCode='" + iataCode + '\'' +
                "}";
    }
}