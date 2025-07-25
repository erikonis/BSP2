public class Client {
    
    private String gender;
    private String familyName;
    private String streetName;
    private int houseNumber;
    private int postalcode;
    private String city;
    private Countries country;
    
    public Client(String gender, String familyName, String streetName, int houseNumber, int postalcode,
            String city, Countries country) {
                
        this.gender = gender;
        this.familyName = familyName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postalcode = postalcode;
        this.city = city;
        this.country = country;
    }

    public Countries getCountry()
    {
        return country;
    }

    @Override
    public String toString() {
        return gender + " " + familyName + ", (" + streetName + " " + houseNumber + ", " + postalcode + ", " + city + ", " + country + ")";
    }

}
