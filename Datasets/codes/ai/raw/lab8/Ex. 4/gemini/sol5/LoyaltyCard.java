// LoyaltyCard.java
import java.util.Objects;

public class LoyaltyCard {
    private final String cardId; // Unique identifier for each physical card
    private final String customerId; // Identifier for the customer account
    private int points;
    private boolean redeemedToday;
    private LocalDate lastRedemptionDate;

    public LoyaltyCard(String cardId, String customerId) {
        this.cardId = cardId;
        this.customerId = customerId;
        this.points = 0;
        this.redeemedToday = false;
        this.lastRedemptionDate = null;
    }

    public String getCardId() {
        return cardId;
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

    public boolean redeemPoints(int amount, LocalDate today) {
        if (!redeemedTodayForDate(today) && this.points >= amount) {
            this.points -= amount;
            this.redeemedToday = true;
            this.lastRedemptionDate = today;
            return true;
        }
        return false;
    }

    public boolean redeemedTodayForDate(LocalDate date) {
        return lastRedemptionDate != null && lastRedemptionDate.equals(date);
    }

    public void resetDailyRedemption(LocalDate today) {
        if (lastRedemptionDate != null && !lastRedemptionDate.equals(today)) {
            this.redeemedToday = false;
            this.lastRedemptionDate = null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoyaltyCard that = (LoyaltyCard) o;
        return Objects.equals(cardId, that.cardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId);
    }

    @Override
    public String toString() {
        return "LoyaltyCard{cardId='" + cardId + "', customerId='" + customerId + "', points=" + points + ", redeemedToday=" + redeemedToday + ", lastRedemptionDate=" + lastRedemptionDate + "}";
    }
}