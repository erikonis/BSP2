import java.util.UUID;

public class loyaltyCards {
    private Customer customer;
    private String cardID;
    private double loyaltyPoints;
    private int count;

    public loyaltyCards(Customer customer){
        this.customer = customer;
        cardID = UUID.randomUUID().toString();
        loyaltyPoints = 0;
        count = 0;
    }

    public loyaltyCards(Customer customer, String cardID){
        this.customer = customer;
        this.cardID = cardID;
        loyaltyPoints = 0;
        count = 0;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addPoints(double price){
        loyaltyPoints = price*0.1;
    }
    
    public int getCount(){
        return count;
    }

    public void redeem(double costs){
        //For the case 1 point = 1 euro
        if(count<2){
            if(loyaltyPoints>= costs){
                loyaltyPoints -= costs;
                count++;
            }
            else
            {
                System.out.println("Not enough points");
            }
        }
        else{
            System.out.println("This card made already a redeem today");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        loyaltyCards other = (loyaltyCards) obj;
        if (cardID == null) {
            if (other.cardID != null)
                return false;
        } else if (!cardID.equals(other.cardID))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return customer + " has " + loyaltyPoints+ " loyalty points on his card";
    }
    
}
