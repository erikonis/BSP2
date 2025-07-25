import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    public static int maxNumberOfGiveaways;
    private static int nationalNumberOfGiveaways;
    private Random random;


    private GiveawayChance giveawayChance;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        this.random = new Random();
        this.giveawayChance = new SmallGiveawayChance(); // Default strategy
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

        if (price >= 20 && price <= 100) {
            giveawayChance = new MediumGiveawayChance();
        } else if (price > 100) {
            giveawayChance = new LargeGiveawayChance();
        }

        double chance = giveawayChance.getChance(price);

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
}