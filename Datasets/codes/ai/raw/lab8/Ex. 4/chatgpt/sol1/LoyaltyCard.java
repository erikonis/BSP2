import java.util.Objects;

public class LoyaltyCard {
    private final String id;
    private double points;

    public LoyaltyCard(String id) {
        this.id = id;
        this.points = 0;
    }

    public String getId() {
        return id;
    }

    public double getPoints() {
        return points;
    }

    public void addPoints(double amount) {
        points += amount * 0.10; // 10% of the purchase amount
    }

    public boolean redeemPoints(double amount) {
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
        return id.equals(that.id);
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
