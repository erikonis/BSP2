import java.time.LocalDate;

public class LoyaltyCard {
    private static int cardCounter = 1;
    private final int cardID;
    private double points;
    private LocalDate lastRedeemedDate;

    public LoyaltyCard() {
        this.cardID = cardCounter++;
        this.points = 0;
        this.lastRedeemedDate = LocalDate.MIN; // Not redeemed yet
    }

    public int getCardID() {
        return cardID;
    }

    public double getPoints() {
        return points;
    }

    public void addPoints(double purchaseAmount) {
        this.points += purchaseAmount * 0.10; // 10% points for every purchase
    }

    public boolean redeem(double amount) {
        if (LocalDate.now().equals(lastRedeemedDate)) {
            return false; // Redemption already done today
        }

        if (points >= amount) {
            points -= amount;
            lastRedeemedDate = LocalDate.now();
            return true;
        }
        return false; // Not enough points to redeem
    }
}
