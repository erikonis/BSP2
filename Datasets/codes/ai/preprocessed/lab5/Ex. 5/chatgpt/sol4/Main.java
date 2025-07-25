import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int totalGiveaways = 30;
        GiveawayManager.maxNumberOfGiveaways = totalGiveaways;

        Shop shop1 = new Shop(totalGiveaways / 3);
        Shop shop2 = new Shop(totalGiveaways / 3);
        Shop shop3 = new Shop(totalGiveaways / 3);

        Random random = new Random();

        while (GiveawayManager.maxNumberOfGiveaways > 0) {
            int shopChoice = random.nextInt(3);
            double price = random.nextDouble() * 120;
            Item item = new Item(price);

            if (shopChoice == 0) {
                shop1.buy(item);
            } else if (shopChoice == 1) {
                shop2.buy(item);
            } else {
                shop3.buy(item);
            }
        }

        System.out.println("Giveaways left in Shop 1: " + shop1.getLocalGiveawaysLeft());
        System.out.println("Giveaways left in Shop 2: " + shop2.getLocalGiveawaysLeft());
        System.out.println("Giveaways left in Shop 3: " + shop3.getLocalGiveawaysLeft());
        System.out.println("Giveaways left at national level: " + GiveawayManager.maxNumberOfGiveaways);
    }
}
 {

}