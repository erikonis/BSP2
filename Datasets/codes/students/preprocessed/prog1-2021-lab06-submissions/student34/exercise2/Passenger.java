public class Passenger extends Person{

    private int loyaltyCardNumber;
	
	public Passenger(String name_, String passportNumber_, int loyaltyCardNumber_) {
        super(name_, passportNumber_);
        this.loyaltyCardNumber = loyaltyCardNumber_;
	}


    public int getloyaltyCardNumber() {
        return loyaltyCardNumber;
    }


    @Override
    public String toString() {
        return "Passenger [loyaltyCardNumber=" + loyaltyCardNumber + "]";
    }  
    


    
}
