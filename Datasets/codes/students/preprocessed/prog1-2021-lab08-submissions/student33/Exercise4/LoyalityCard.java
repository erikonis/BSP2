import java.util.UUID;

public class LoyalityCard {
    private UUID id;
    private int numberFamilyMembers;
    private double points;

    public LoyalityCard(int quantity) {
        this.id = UUID.randomUUID();
        this.setQuantity(quantity);
        this.setPoints(0);

    }

    public double getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getQuantity() {
        return numberFamilyMembers;
    }

    public void setQuantity(int quantity) {
        this.numberFamilyMembers = quantity;
    }

    public UUID getiD() {
        return id;
    }

    public void addPoints(double d) {
        this.points += d;
    }
    public void removePoints(double value) {
        this.points -= value;
    }

    @Override
    public String toString() {
        return "Points: " + points;
    }

}
