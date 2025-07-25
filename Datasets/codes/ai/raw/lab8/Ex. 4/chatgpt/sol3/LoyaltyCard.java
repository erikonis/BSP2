import java.util.Objects;

public class LoyaltyCard {
    private final String id;
    private double points;

    public LoyaltyCard(String id) {
        this.id = id;
        this.points = 0.0;
    }

    public String getId() {
        return id;
    }

    public double getPoints() {
        return points;
    }

    public void addPurchase(double amount) {
        this.points += amount * 0.1; // 10% of purchase amount as points
    }

    public boolean redeem(double amount) {
        if (points >= amount) {
            points -= amount;
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