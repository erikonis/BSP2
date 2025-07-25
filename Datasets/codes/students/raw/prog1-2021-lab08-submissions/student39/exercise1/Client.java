package lu.uni.programming1.lab8.exercise1;

public class Client {
    
    private String name, adress, ZIPcode, city, country;

    public Client(String name, String adress, String zIPcode, String city, String country) {
        this.name = name;
        this.adress = adress;
        ZIPcode = zIPcode;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getZIPcode() {
        return ZIPcode;
    }

    public void setZIPcode(String zIPcode) {
        ZIPcode = zIPcode;
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

    @Override
    public String toString() {
        return "Mr. or Ms." + name + ",( " + adress + ", " + ZIPcode + ", " + city + ", " + country + ")";
    }

}
