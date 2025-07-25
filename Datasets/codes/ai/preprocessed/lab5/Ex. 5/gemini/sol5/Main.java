import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int totalGiveaways = 15; // Example: 15 total giveaways
        Shop.setMaxNumberOfGiveaways(totalGiveaways); // Set the maximum number of giveaways

        int giveawaysPerShop = totalGiveaways / 3;
        Shop shop1 = new Shop(giveawaysPerShop);
        Shop shop2 = new Shop(giveawaysPerShop);
        Shop shop3 = new Shop(giveawaysPerShop);

        Random random = new Random();
        while (Shop.getTotalNumberOfGiveaways() > 0) {
            // Simulate a customer buying an item at a random shop
            int shopNumber = random.nextInt(3) + 1; // 1, 2, or 3
            double itemPrice = random.nextDouble() * 120; // Price between 0 and 120 EUR
            Item item = new Item(itemPrice);

            switch (shopNumber) {
                case 1:
                    System.out.println("\nCustomer buying at Shop 1:");
                    shop1.buy(item);
                    break;
                case 2:
                    System.out.println("\nCustomer buying at Shop 2:");
                    shop2.buy(item);
                    break;
                case 3:
                    System.out.println("\nCustomer buying at Shop 3:");
                    shop3.buy(item);
                    break;
            }
        }

        System.out.println("\n--- Giveaways Report ---");
        System.out.println("Shop 1 giveaways left: " + shop1.getLocalNumberOfGiveaways());
        System.out.println("Shop 2 giveaways left: " + shop2.getLocalNumberOfGiveaways());
        System.out.println("Shop 3 giveaways left: " + shop3.getLocalNumberOfGiveaways());
        System.out.println("Total giveaways left: " + Shop.getTotalNumberOfGiveaways());
    }
}