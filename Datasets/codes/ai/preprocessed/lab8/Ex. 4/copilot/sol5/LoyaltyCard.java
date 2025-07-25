import java.util.Objects;

public class LoyaltyCard {
    private String id;
    private double points;

    public LoyaltyCard(String id, double points) {
        this.id = id;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public double getPoints() {
        return points;
    }

    public void addPoints(double amount) {
        this.points += amount * 0.10;
    }

    public boolean redeem(double amount) {
        if (points >= amount) {
            points -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LoyaltyCard that = (LoyaltyCard) obj;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}