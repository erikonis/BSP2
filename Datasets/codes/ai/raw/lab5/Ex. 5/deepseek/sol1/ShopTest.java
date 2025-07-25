package exercise5;

import java.util.Random;

public class ShopTest {
    public static void main(String[] args) {
        // Set the total number of giveaways
        int totalGiveaways = 30;
        Shop.setMaxNumberOfGiveaways(totalGiveaways);

        // Create 3 shops with an equal distribution of giveaways
        Shop shop1 = new Shop(totalGiveaways / 3);
        Shop shop2 = new Shop(totalGiveaways / 3);
        Shop shop3 = new Shop(totalGiveaways / 3);

        Random random = new Random();

        // Simulate customers buying items until no giveaways are left
        while (Shop.getMaxNumberOfGiveaways() > 0) {
            // Randomly select a shop
            Shop shop = null;
            int shopNumber = random.nextInt(3) + 1;
            switch (shopNumber) {
                case 1:
                    shop = shop1;
                    break;
                case 2:
                    shop = shop2;
                    break;
                case 3:
                    shop = shop3;
                    break;
            }

            // Randomly generate an item price between 0 and 120 euros
            double price = random.nextDouble() * 120;
            Item item = new Item(price);

            // Simulate the purchase
            shop.buy(item);
        }

        // Print the remaining giveaways
        System.out.println("\nRemaining giveaways:");
        System.out.println("Shop 1: " + shop1.getLocalNumberOfGiveaways());
        System.out.println("Shop 2: " + shop2.getLocalNumberOfGiveaways());
        System.out.println("Shop 3: " + shop3.getLocalNumberOfGiveaways());
        System.out.println("National level: " + Shop.getMaxNumberOfGiveaways());
    }
}