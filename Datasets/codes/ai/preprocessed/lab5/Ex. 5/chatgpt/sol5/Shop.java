import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    private static int maxNumberOfGiveaways;
    private static Random random = new Random();

    public Shop(int initialGiveaways) {
        this.localNumberOfGiveaways = initialGiveaways;
    }

    public static void setTotalGiveaways(int total) {
        maxNumberOfGiveaways = total;
    }

    public static int getTotalGiveaways() {
        return maxNumberOfGiveaways;
    }

    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    public void buy(Item item) {
        double price = item.getPrice();
        System.out.printf("Item purchased for: €%.2f%n", price);

        if (localNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways in this shop.");
            return;
        }

        if (maxNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways available nationally.");
            return;
        }

        double chance = 0;
        if (price < 20) chance = 0.02;
        else if (price <= 100) chance = 0.05;
        else chance = 0.10;

        if (random.nextDouble() < chance) {
            System.out.println("🎁 Customer won a giveaway!");
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
        } else {
            System.out.println("No giveaway this time.");
        }
    }
}