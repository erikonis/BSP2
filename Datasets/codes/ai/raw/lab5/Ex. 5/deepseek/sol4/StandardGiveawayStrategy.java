package exercise5;

public class StandardGiveawayStrategy implements GiveawayStrategy {
    @Override
    public double calculateChance(double price) {
        if (price < 20) {
            return 0.02; // 2% chance
        } else if (price <= 100) {
            return 0.05; // 5% chance
        } else {
            return 0.10; // 10% chance
        }
    }
}