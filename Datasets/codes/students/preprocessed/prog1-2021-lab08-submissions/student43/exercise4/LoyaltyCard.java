import java.util.UUID;

public class LoyaltyCard {
    private int points;
    private UUID id;

    public LoyaltyCard(UUID id) {
        this.points = 0;
        this.id = id;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public UUID getID() {
        return this.id;
    }

}