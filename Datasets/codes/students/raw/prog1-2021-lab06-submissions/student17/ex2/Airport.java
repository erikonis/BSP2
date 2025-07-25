package ex2;
public class Airport {
    private String city;
    private String country;
    private String iataCode;
    
    public String getCity() {
        return city;
    }
   
    public String getCountry() {
        return country;
    }
   
    public String getIataCode() {
        return iataCode;
    }

    public Airport(String city, String country, String iataCode) {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
    }

    @Override
    public String toString() {
        System.out.println("Airport city: " + city);
        System.out.println("Airport country: " + country);
        return "The iataCode: " + iataCode ;
    }
    
}