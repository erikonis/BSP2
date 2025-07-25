package Exercise1;

public enum Country {
    
    Nothing(0),
    Luxembourg (0),
    France (30),
    Belgium (50),
    Germany (40);

    private int basePrice;

    private Country(int basePrice){
        this.basePrice = basePrice;
    }
    public int getBasePrice(){ 
        return basePrice;
    }

}
