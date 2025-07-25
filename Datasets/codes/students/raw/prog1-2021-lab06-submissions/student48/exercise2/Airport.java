package lu.uni.programming1.lab6.exercise2;

public class Airport {
    private String city, country, iataCode;

    public Airport(String city, String country, String iataCode) {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getIataCode() {
        return this.iataCode;
    }

    @Override
    public String toString() {
        return city + ", " + country + ", " + iataCode;
    }
}
