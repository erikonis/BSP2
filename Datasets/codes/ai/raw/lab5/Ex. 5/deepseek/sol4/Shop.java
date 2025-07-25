package exercise5;

import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    private static int maxNumberOfGiveaways;
    private GiveawayStrategy giveawayStrategy;

    public Shop(int localNumberOfGiveaways, GiveawayStrategy giveawayStrategy) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        this.giveawayStrategy = giveawayStrategy;
    }

    public static void setMaxNumberOfGiveaways(int max) {
        maxNumberOfGiveaways = max;
    }

    public void buy(Item item) {
        System.out.println("Item purchased for: " + item.getPrice() + " euros");

        if (localNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left in this shop.");
            return;
        }
        if (maxNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left at national level.");
            return;
        }

        double chance = giveawayStrategy.calculateChance(item.getPrice());
        Random random = new Random();
        if (random.nextDouble() < chance) {
            awardGiveaway();
        } else {
            System.out.println("Sorry, no giveaway this time.");
        }
    }

    private void awardGiveaway() {
        System.out.println("Congratulations! You won a giveaway!");
        localNumberOfGiveaways--;
        maxNumberOfGiveaways--;
    }

    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    public static int getMaxNumberOfGiveaways() {
        return maxNumberOfGiveaways;
    }
}