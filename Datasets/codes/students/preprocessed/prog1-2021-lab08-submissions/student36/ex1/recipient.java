public class Recipient {
    private String name;
    private String street;
    private int zipcode;
    private String country;
    private String item;

    public Recipient(String name, String street, int zipcode, String country, String item){
        this.name = name;
        this.street = street;
        this.zipcode = zipcode;
        this.country = country;
        this.item = item;
    }
    public String getName() {
        return name;
    }
    public String getStreet() {
        return street;
    }
    public int getZipcode() {
        return zipcode;
    }
    public String getCountry() {
        return country;
    }
    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Shipping for: "+name+" ("+ street+", "+ zipcode+", "+ country+")"+"\r\n"+"Item: "+item;
    }

    
}
