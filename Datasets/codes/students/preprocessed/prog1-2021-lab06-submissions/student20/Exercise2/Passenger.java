public class Passenger extends Person {

    
    

    public Passenger(String name, String PassportNumber, int loyalityCardNumber) {
        super(name, PassportNumber);
        this.loyalityCardNumber = loyalityCardNumber;
    }

    private int loyalityCardNumber;

    public int getLoyalityCardNumber() {
        return loyalityCardNumber;
    }

    


 
    
}
