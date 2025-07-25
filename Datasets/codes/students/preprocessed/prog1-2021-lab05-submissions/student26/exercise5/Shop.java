import java.util.Random;

public class Shop {
    int localNumberOfGiveaways, maxNumberOfGiveaways;

    Shop(int localNumberOfGiveaways, int maxNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        this.maxNumberOfGiveaways = maxNumberOfGiveaways;
    }

    public void buy(Item item) {
        Random random = new Random();
        int generate = 0;
        System.out.println("\nPrice: " + item.getPrice());
        if (localNumberOfGiveaways == 0 || maxNumberOfGiveaways == 0) {
            System.out.println("There are no more giveaways left!");
        } else {
            if (item.getPrice() < 20) {
                generate = random.nextInt(50);
                // equals 1 exact number out of 50 -> 2% chance
                if (generate == 1) {
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                    System.out.println("You won the giveaway!");
                }
            } else if (item.getPrice() >= 20 || item.getPrice() <= 100) {
                generate = random.nextInt(20);
                if (generate == 1) {
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                    System.out.println("You won the giveaway!");
                }
            } else {
                generate = random.nextInt(10);
                if (generate == 1) {
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                    System.out.println("You won the giveaway!");
                }
            }
        }
    }
}
