package lu.uni.programming1.lab8.exercise1;

public class Individual {

    private String name;
    private String address;
    private Country country;

    public Individual(String name, String address, Country country) {
        this.name=name;
        this.address=address;
        this.country=country;
    }

    public String GetName() {
        return name;
    }

    public String GetAdress() {
        return address;
    }

    public Country GetCountry() {
        return country;
    } 
    
}
