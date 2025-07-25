package Exercise1;

public class Package {
    private String name, adress, item;
    private Method method;
    private Country country;
    private int price=0;

    public Package(String name, String adress, String item, Method method, Country country) {
        this.name = name;
        this.adress = adress;
        this.item = item;
        this.method = method;
        this.country= country;
        price=this.method.getFee()+this.country.getFee();
    }

   
    @Override
    public String toString() {
        return "Shipping for "+name+",("+adress+", "+country+"), \n\tItem: "+item+
        ",\n\tShipping method: "+method.toString()+", \n\tTOTAL cost: "+price+" EUR\n";
    }

    
    


}
