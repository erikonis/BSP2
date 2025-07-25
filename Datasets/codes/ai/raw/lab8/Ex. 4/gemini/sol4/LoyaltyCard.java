// LoyaltyCard.java
import java.util.Objects;

public class LoyaltyCard {
    private final String customerId; // Using customerId as the unique identifier for the account
    private int points;
    private boolean redeemedToday;

    public LoyaltyCard(String customerId) {
        this.customerId = customerId;
        this.points = 0;
        this.redeemedToday = false;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(double purchaseAmount) {
        this.points += (int) (purchaseAmount * 0.10);
    }

    public boolean redeemPoints(int amount) {
        if (!redeemedToday && this.points >= amount) {
            this.points -= amount;
            this.redeemedToday = true;
            return true;
        }
        return false;
    }

    public void resetRedemptionFlag() {
        this.redeemedToday = false; // To be called at the start of a new day (simplified)
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoyaltyCard that = (LoyaltyCard) o;
        return Objects.equals(customerId, that.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public String toString() {
        return "LoyaltyCard{customerId='" + customerId + "', points=" + points + ", redeemedToday=" + redeemedToday + "}";
    }
}