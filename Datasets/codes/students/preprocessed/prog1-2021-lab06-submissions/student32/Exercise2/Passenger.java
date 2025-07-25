public class Passenger extends Person{
    
    //attbues

    private int loyaltyCard;

    //methodes
    
    public Passenger(String name, String passportName, int loyaltyCard) {
        super(name, passportName);
        this.loyaltyCard = loyaltyCard;
    }

    public int getLoyaltyCard() {
        return loyaltyCard;
    }
    
}
