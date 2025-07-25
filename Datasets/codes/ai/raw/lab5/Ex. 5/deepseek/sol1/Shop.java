package exercise5;

import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    private static int maxNumberOfGiveaways;

    // Constructor to initialize localNumberOfGiveaways
    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    // Setter for maxNumberOfGiveaways
    public static void setMaxNumberOfGiveaways(int max) {
        maxNumberOfGiveaways = max;
    }

    // Method to simulate buying an item
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

        // Determine the chance of winning a giveaway
        double chance = 0;
        if (item.getPrice() < 20) {
            chance = 0.02; // 2% chance
        } else if (item.getPrice() <= 100) {
            chance = 0.05; // 5% chance
        } else {
            chance = 0.10; // 10% chance
        }

        // Randomly award a giveaway
        Random random = new Random();
        if (random.nextDouble() < chance) {
            System.out.println("Congratulations! You won a giveaway!");
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
        } else {
            System.out.println("Sorry, no giveaway this time.");
        }
    }

    // Getter for localNumberOfGiveaways
    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    // Getter for maxNumberOfGiveaways
    public static int getMaxNumberOfGiveaways() {
        return maxNumberOfGiveaways;
    }
}