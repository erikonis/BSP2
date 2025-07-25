import java.util.UUID;

public class LoyaltyCard {
    private String uuid;
    private int points;

    public LoyaltyCard(String uuid, int points) {
        this.uuid = uuid;
        this.points = points;
    }

    public LoyaltyCard() {
        this(UUID.randomUUID().toString(), 0);
    }

    public String getUUID() {
        return uuid;
    }

    public int getPoints() {
        return points;
    }

    public void buy(double amount) {
        this.points = (int) (points + Math.floor(amount / 10));
        System.out
                .format(String.format("%s: has been bought for %.2f euro, current %d points.", this, amount, this.points));
    }

    public boolean doRedeem(double amount) {
        return this.points >= Math.ceil(amount);
    }

    public void redeem(double amount) {
        if (this.doRedeem(amount)) {
            this.points -= (int) Math.ceil(amount);
            System.err.println(
                    String.format("%s: %2f euro has been redeemed, current %d points.", this, amount, this.points));
        }

    }

    @Override
    public boolean equals(Object myObj) {

        if (myObj == this) {
            return true;
        }

        if (!(myObj instanceof LoyaltyCard)) {
            return false;
        }

        LoyaltyCard lc = (LoyaltyCard) myObj;

        return this.uuid.equals(lc.getUUID());
    }

    @Override
    public int hashCode() {
        return this.uuid.hashCode();
    }

    @Override
    public String toString() {
        return "\nLoyalty Card No. " + this.uuid;
    }

}
