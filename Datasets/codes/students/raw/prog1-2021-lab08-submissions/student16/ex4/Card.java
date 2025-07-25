import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Card {
    UUID CardID;
    double loyaltypoints;
    LocalDate Today;

    public Card(double loyaltypoints) {
        CardID = UUID.randomUUID();
        this.loyaltypoints = loyaltypoints;
        // get the date of today
        Today = LocalDate.now();

    }

    // calculate the bill
    public double bill(double price) {
        loyaltypoints += price / 100 * 10; // 10 % from the price will be added to the loyaltypoints
        System.out.println("Bought for= " + price); // print the price
        System.out.println("Points received= " + loyaltypoints);// print the points
        return price;
    }

    // pwp=paid with points
    public void pwp(double price) {
        // check if you have enough loyaltypoints and if the id corresponds to the card
        if (loyaltypoints > price) {
            if (Supermarket.getMap().contains(Today) && Supermarket.getMap().contains(CardID)) {
                System.out.println("Thanks for paying with your points.");
                // remove the points with the value of the price
                loyaltypoints -= price;
                System.out.println("Bought with points and know you have =" + loyaltypoints + " points left. ");
            }
        }
        // you don't have enough points for the bill
        else {
            System.out.println("Sorry, you do not have enough points to buy the bill with your points");
        }
    }

    public UUID getCardID() {
        return CardID;
    }

    public void setCardID(UUID cardID) {
        CardID = cardID;
    }

    public double getLoyaltypoints() {
        return loyaltypoints;
    }

    public void setLoyaltypoints(double loyaltypoints) {
        this.loyaltypoints = loyaltypoints;
    }

    @Override
    public String toString() {
        return "Card [CardID=" + CardID + ", loyaltypoints=" + loyaltypoints + "]";
    }

}