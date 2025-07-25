package exercise1;

public class Client {
    private String name;
    private boolean male;
    private String address;
    private Country country;
    private int postNum;
    private String city;

    public Client(String name, String address, Country country, int postNum, String city, boolean male) {
        this.name = name;
        this.address = address;
        this.postNum = postNum;
        this.country = country;
        this.city = city;
        this.male = male;
    }

    public Country getCountry(){
        return country;
    }
    
    public String getFullAddress(){
        return (address+", "+postNum+", "+city+", "+country); 
    }

    public String shouldIcallYouMister(){
        if(male){
            return "Mr. "+name;
        }
        else{
            return "Mrs. "+name;
        }
    }
}
