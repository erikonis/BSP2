package exercise4;

import java.util.UUID;

public class LoyaltyCard {

    private UUID id /*= UUID.randomUUID()*/;
    private int points = 0;
    private boolean todayRedeemed = false;

    public LoyaltyCard(UUID id, int points, boolean todayRedeemed) {
        this.id = id;
        this.points = points;
        this.todayRedeemed = todayRedeemed;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public boolean isTodayRedeemed() {
        return todayRedeemed;
    }

    public void setTodayRedeemed(boolean todayRedeemed) {
        this.todayRedeemed = todayRedeemed;
    }

    public void addPoints(int addedPoints) {
        points = points + (int)(0.1 * addedPoints);
    }

    public void redeemPoints(int redeemedPoints) {
        points = points - redeemedPoints;
    }

}
