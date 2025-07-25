package exercise2;

public class Airport {
    private String city;
    private String country;
    private String iataCode;

    public Airport(String city, String country, String iataCode) {
        this.setCity(city);
        this.setCountry(country);
        this.setIataCode(iataCode);
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City: "+getCity()+"\tCountry: "+getCountry()+"\t\tIATA code: "+getIataCode();
    }
}
