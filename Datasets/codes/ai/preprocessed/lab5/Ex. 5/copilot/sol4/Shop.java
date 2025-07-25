import java.util.Random;

public class Shop {
    private static int maxNumberOfGiveaways;
    private int localNumberOfGiveaways;

    public ShopWithCategory(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public static void setMaxNumberOfGiveaways(int maxGiveaways) {
        maxNumberOfGiveaways = maxGiveaways;
    }

    public void buy(ItemWithCategory item) {
        System.out.println("Price of the purchased item: " + item.getPrice() + "€");
        System.out.println("Category of the purchased item: " + item.getCategory());

        if (localNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left in this shop.");
            return;
        }

        if (maxNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left at national level.");
            return;
        }

        double price = item.getPrice();
        double chance = 0;
        if (price < 20) {
            chance = 0.02;
        } else if (price <= 100) {
            chance = 0.05;
        } else {
            chance = 0.10;
        }

        Random random = new Random();
        if (random.nextDouble() < chance) {
            System.out.println("Congratulations! You won a giveaway!");
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
        } else {
            System.out.println("Sorry, no giveaway this time.");
        }
    }

    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    public static int getMaxNumberOfGiveaways() {
        return maxNumberOfGiveaways;
    }
}