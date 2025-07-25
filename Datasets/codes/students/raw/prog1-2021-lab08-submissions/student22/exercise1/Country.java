package exercise1;

public enum Country {
    LUX(0,"LUXEMBOURG"), FRA(30,"FRANCE"),
    GER(40,"GERMANY"), BEL(50,"BELGIUM");

    private double price;
    private String country;
    Country(double price, String country){
        this.price = price;
        this.country = country;
    }
    public double getPrice(){
        return price;
    }
    public String getCountry(){
        return country;
    }
}

