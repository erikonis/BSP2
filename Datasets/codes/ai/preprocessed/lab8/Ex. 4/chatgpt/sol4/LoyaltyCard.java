import java.time.LocalDate;

public class LoyaltyCard {
    private final String cardID;
    private double points;
    private LocalDate lastRedeemedDate;

    // Constructor for a loyalty card
    public LoyaltyCard(String cardID) {
        this.cardID = cardID;
        this.points = 0;
        this.lastRedeemedDate = LocalDate.MIN;
    }

    // Getters
    public String getCardID() {
        return cardID;
    }

    public double getPoints() {
        return points;
    }

    public LocalDate getLastRedeemedDate() {
        return lastRedeemedDate;
    }

    // Adds points based on the purchase amount (10% of the purchase amount)
    public void addPoints(double purchaseAmount) {
        this.points += purchaseAmount * 0.10;
    }

    // Redeem points from the card. Redemption is allowed only once per day.
    public boolean redeem(double amount) {
        // Check if the card has been used today or if there are not enough points
        if (LocalDate.now().equals(lastRedeemedDate)) {
            return false; // Redemption already done today
        }

        if (points >= amount) {
            points -= amount;
            lastRedeemedDate = LocalDate.now();
            return true; // Redemption successful
        }

        return false; // Not enough points to redeem
    }
}