public package giveaways;

import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    public static int maxNumberOfGiveaways;
    private static int nationalNumberOfGiveaways;
    private Random random;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        this.random = new Random();
    }

    public static void setMaxNumberOfGiveaways(int maxNumberOfGiveaways) {
        Shop.maxNumberOfGiveaways = maxNumberOfGiveaways;
        Shop.nationalNumberOfGiveaways = maxNumberOfGiveaways;
    }

    public void buy(Item item) {
        double price = item.getPrice();
        System.out.println("Item price: " + price + " EUR");

        if (localNumberOfGiveaways == 0) {
            System.out.println("Sorry, this shop has no more giveaways left.");
            return;
        }

        if (nationalNumberOfGiveaways == 0) {
            System.out.println("Sorry, there are no more giveaways left at national level.");
            return;
        }

        double chance = 0;
        if (price < 20) {
            chance = 0.02;
        } else if (price >= 20 && price <= 100) {
            chance = 0.05;
        } else {
            chance = 0.10;
        }

        if (random.nextDouble() < chance) {
            System.out.println("Congratulations! You won a giveaway.");
            localNumberOfGiveaways--;
            nationalNumberOfGiveaways--;
        }
    }

    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    public static int getNationalNumberOfGiveaways() {
        return nationalNumberOfGiveaways;
    }
} {

}