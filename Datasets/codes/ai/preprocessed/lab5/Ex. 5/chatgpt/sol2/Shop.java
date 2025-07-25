import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    static int maxNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public void buy(Item item) {
        System.out.println("Price of purchased item: " + item.getPrice() + "€");

        if (localNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left in this shop.");
            return;
        }

        if (maxNumberOfGiveaways <= 0) {
            System.out.println("No more giveaways left at national level.");
            return;
        }

        Random random = new Random();
        double chance = 0;

        if (item.getPrice() < 20) {
            chance = 0.02;
        } else if (item.getPrice() <= 100) {
            chance = 0.05;
        } else {
            chance = 0.10;
        }

        if (random.nextDouble() < chance) {
            System.out.println("Congratulations, you won a giveaway!");
            localNumberOfGiveaways--;
            maxNumberOfGiveaways--;
        } else {
            System.out.println("No giveaway this time.");
        }
    }
}
 {

}