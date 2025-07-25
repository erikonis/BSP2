import java.util.Objects;

public class LoyaltyCard {
    private String id;
    private int points;

    private LoyaltyCard(Builder builder) {
        this.id = builder.id;
        this.points = builder.points;
    }

    public String getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(double purchaseAmount) {
        points += (int) (purchaseAmount * 0.1); // 10% of the purchase amount
    }

    public boolean redeemPoints(int amount) {
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
        return "LoyaltyCard{" +
               "id='" + id + '\'' +
               ", points=" + points +
               '}';
    }

    public static class Builder {
        private String id;
        private int points = 0;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public LoyaltyCard build() {
            return new LoyaltyCard(this);
        }
    }
}