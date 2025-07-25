import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    private static int maxNumberOfGiveaways;
    private static int totalNumberOfGiveaways; // Class attribute to track total giveaways

    public Shop(int initialNumberOfGiveaways) {
        this.localNumberOfGiveaways = initialNumberOfGiveaways;
    }

    public static void setMaxNumberOfGiveaways(int maxGiveaways) {
        Shop.maxNumberOfGiveaways = maxGiveaways;
        Shop.totalNumberOfGiveaways = maxGiveaways;
    }

    public void buy(Item item) {
        double price = item.getPrice();
        System.out.println("Price of purchased item: " + price + " EUR");

        if (localNumberOfGiveaways == 0) {
            System.out.println("Sorry, this shop has no more giveaways left.");
        } else if (totalNumberOfGiveaways == 0) {
            System.out.println("Sorry, there are no more giveaways left at national level.");
        } else {
            double giveawayProbability = 0;
            if (price < 20) {
                giveawayProbability = 0.02; // 2%
            } else if (price >= 20 && price <= 100) {
                giveawayProbability = 0.05; // 5%
            } else {
                giveawayProbability = 0.10; // 10%
            }

            Random random = new Random();
            if (random.nextDouble() < giveawayProbability) {
                System.out.println("Congratulations! You won a giveaway!");
                localNumberOfGiveaways--;
                totalNumberOfGiveaways--;
            }
        }
    }

      public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    public static int getTotalNumberOfGiveaways() {
        return totalNumberOfGiveaways;
    }
}