package Exercise1;

public class Adress {
    private String Name;
    private String sexe;
    private String street;
    private int houseNumber;
    private int zip;
    private String city;
    private String country;
    
    public Adress(String name, String sexe, String street, int houseNumber, int zip, String city,String country) {
        Name = name;
        this.sexe = sexe;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zip = zip;
        this.city = city;
        this.country = country;
    }
    
    @Override 
    public String toString(){
        String title ="";
        if(sexe.equals("Male"))
        {
           title = "Mr.";
        }
        else
        {
            title = "Ms.";
        }
        return  title + Name + ", (" + houseNumber + ", " 
        + street + ", " + zip + ", " + city + ", " + country + "),";
    }
}
