package exercise1;

public class Client {
    private String name;
    private String adress;
    private Country country;

    public Client(String name, String adress, Country country){
        this.name = name;
        this.adress = adress;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return name + ", (" + adress + ", " +country.getCountry() +")";
    }

    
}
