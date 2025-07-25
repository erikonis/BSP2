import java.util.UUID;

public class LoyaltyCard {
    private UUID id;
    private int numberOfFamilyMembers;
    private double loyaltyPoints;

    public LoyaltyCard(int quantity) {
        this.id = UUID.randomUUID();
        this.setQuantity(quantity);
        this.setPoints(0);

    }

    public double getPoints() {
        return loyaltyPoints;
    }

    public void setPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getQuantity() {
        return numberOfFamilyMembers;
    }

    public void setQuantity(int quantity) {
        this.numberOfFamilyMembers = quantity;
    }

    public UUID getiD() {
        return id;
    }

    public void addPoints(double d) {
        this.loyaltyPoints += d;
    }
    public void removePoints(double value) {
        this.loyaltyPoints -= value;
    }

    @Override
    public String toString() {
        return "Current points: " + loyaltyPoints;
    }
}
