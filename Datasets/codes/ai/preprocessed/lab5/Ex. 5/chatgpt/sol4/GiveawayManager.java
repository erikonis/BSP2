import java.util.Random;

public class GiveawayManager {
    private int localNumberOfGiveaways;
    static int maxNumberOfGiveaways;

    public GiveawayManager(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public boolean awardGiveaway(Item item) {
        if (!hasGiveawaysLeft()) return false;

        double chance = getWinningChance(item);

        if (new Random().nextDouble() < chance) {
            decrementGiveaways();
            return true;
        }

        return false;
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
 {

}