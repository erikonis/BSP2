package exercise1;

public class Adress {
    String streetName,townName;
    int streetNb,postalCode;
    Country country;

    
    public Adress(String streetName, String townName, int streetNb, int postalCode, Country country) {
        this.streetName = streetName;
        this.townName = townName;
        this.streetNb = streetNb;
        this.postalCode = postalCode;
        this.country = country;
    }


    @Override
    public String toString(){
        if(country==Country.LUXEMBURG){
            return streetNb+", "+streetName+", L-"+postalCode+", "+townName+", "+country.toString();
        }
        if(country==Country.GERMANY){
            return streetName+". "+streetNb+", "+postalCode+", "+townName+", "+country.toString();
        }
        if(country==Country.BELGIUM){
            return streetName+" "+streetNb+", "+postalCode+" "+townName+", "+country.toString();
        }
        if(country==Country.LUXEMBURG){
            return streetNb+" "+streetName+", "+postalCode+" "+townName+", "+country.toString();
        }
        return "ERROR";
    }
    
    
}
