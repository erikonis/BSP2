// LoyaltyCard.java
import java.util.Objects;

public class LoyaltyCard {
    private final String id;
    private int points;

    public LoyaltyCard(String id) {
        this.id = id;
        this.points = 0;
    }

    public String getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(double purchaseAmount) {
        this.points += (int) (purchaseAmount * 0.10);
    }

    public boolean redeemPoints(int amount) {
        if (this.points >= amount) {
            this.points -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoyaltyCard that = (LoyaltyCard) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LoyaltyCard{id='" + id + "', points=" + points + "}";
    }
}