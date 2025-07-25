import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    static int maxNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public void buy(Item item) {
        System.out.println("Price of purchased item: " + item.getPrice() + "€");

        if (!hasGiveawaysLeft()) return;

        double chance = getWinningChance(item);

        if (new Random().nextDouble() < chance) {
            System.out.println("Congratulations, you won a giveaway!");
            decrementGiveaways();
        } else {
            System.out.println("No giveaway this time.");
        }
    }

    private boolean hasGiveawaysLeft() {
        if (localNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left in this shop.");
            return false;
        }

        if (maxNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left at national level.");
            return false;
        }

        return true;
    }

    private double getWinningChance(Item item) {
        if (item.getPrice() < 20) return 0.02;
        if (item.getPrice() <= 100) return 0.05;
        return 0.10;
    }

    private void decrementGiveaways() {
        localNumberOfGiveaways--;
        maxNumberOfGiveaways--;
    }
}