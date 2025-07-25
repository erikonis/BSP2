public package exercise5;

import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    private static int maxNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
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

        double chance = calculateChance(item.getPrice());
        Random random = new Random();
        if (random.nextDouble() < chance) {
            awardGiveaway();
        } else {
            System.out.println("Sorry, no giveaway this time.");
        }
    }

    protected double calculateChance(double price) {
        if (price < 20) {
            return 0.02; // 2% chance
        } else if (price <= 100) {
            return 0.05; // 5% chance
        } else {
            return 0.10; // 10% chance
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
} {
    
}
