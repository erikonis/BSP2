import java.time.LocalDate;
import java.util.Objects;

public class LoyaltyCard {
    private final String cardId;
    private int points;

    public LoyaltyCard(String cardId) {
        this.cardId = cardId;
        this.points = 0;
    }

    public void addPoints(double purchaseAmount) {
        points += (int)(purchaseAmount * 0.10);
    }

    public boolean redeemPoints(int amount) {
        if (points >= amount) {
            points -= amount;
            return true;
        }
        return false;
    }

    public String getCardId() {
        return cardId;
    }

    public int getPoints() {
        return points;
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
        return "LoyaltyCard{" +
                "cardId='" + cardId + '\'' +
                ", points=" + points +
                '}';
    }
}