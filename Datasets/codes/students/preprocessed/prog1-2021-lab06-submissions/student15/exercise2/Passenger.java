public class Passenger extends Person{
    private int loyaltyCardNumber;

    public Passenger(String name, String passportNumber, Flight flight, int loyaltyCardNumber) {
        super(name, passportNumber,flight);
        this.setLoyaltyCardNumber(loyaltyCardNumber);
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    public void setLoyaltyCardNumber(int loyaltyCardNumber) {
        this.loyaltyCardNumber = loyaltyCardNumber;
    }
    
    @Override
    public String toString() {
        return "\n\t-Passenger-"+super.toString()+"\nLoyalty Card Number: "+loyaltyCardNumber;
    }
}
