import java.time.LocalDate;
import java.util.Objects;

public class LoyaltyCard {
    private final String id;
    private double points;
    private LocalDate lastRedeemDate;

    public LoyaltyCard(String id) {
        this.id = id;
        this.points = 0.0;
        this.lastRedeemDate = null;
    }

    public String getId() {
        return id;
    }

    public double getPoints() {
        return points;
    }

    public boolean addPurchase(double amount) {
        if (amount <= 0) return false;
        points += amount * 0.10;
        return true;
    }

    public boolean redeem(double amount, LocalDate date) {
        if (points >= amount && (lastRedeemDate == null || !lastRedeemDate.equals(date))) {
            points -= amount;
            lastRedeemDate = date;
            return true;
        }
        return false;
    }

    public LocalDate getLastRedeemDate() {
        return lastRedeemDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoyaltyCard)) return false;
        LoyaltyCard that = (LoyaltyCard) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LoyaltyCard{" +
                "id='" + id + ''' +
                ", points=" + points +
                ", lastRedeemDate=" + lastRedeemDate +
                '}';
    }
}