package lu.uni.programming1.lab6.exercise2;

public class Airport {
    private String city;
    private String country;
    private String iataCode;

    public Airport(String city, String country, String iataCode) {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
    
    
}
