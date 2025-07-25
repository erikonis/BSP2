public package exercise5;

public class PremiumGiveawayStrategy implements GiveawayStrategy {
    @Override
    public double calculateChance(double price) {
        // Premium shops have double the chance of winning
        if (price < 20) {
            return 0.04; // 4% chance
        } else if (price <= 100) {
            return 0.10; // 10% chance
        } else {
            return 0.20; // 20% chance
        }
    }
} {

}