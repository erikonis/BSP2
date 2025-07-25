import java.util.Random;

public class ShopTest {
    public static void main(String[] args) {
        int totalGiveaways = 30;
        Shop.setMaxNumberOfGiveaways(totalGiveaways);

        Shop shop1 = new Shop(totalGiveaways / 3, new StandardGiveawayStrategy());
        Shop shop2 = new Shop(totalGiveaways / 3, new PremiumGiveawayStrategy()); // Premium shop
        Shop shop3 = new Shop(totalGiveaways / 3, new StandardGiveawayStrategy());

        Random random = new Random();

        while (Shop.getMaxNumberOfGiveaways() > 0) {
            Shop shop = null;
            int shopNumber = random.nextInt(3) + 1;
            switch (shopNumber) {
                case 1:
                    shop = shop1;
                    break;
                case 2:
                    shop = shop2;
                    break;
                case 3:
                    shop = shop3;
                    break;
            }

            double price = random.nextDouble() * 120;
            Item item = new Item(price);

            shop.buy(item);
        }

        System.out.println("\nRemaining giveaways:");
        System.out.println("Shop 1: " + shop1.getLocalNumberOfGiveaways());
        System.out.println("Shop 2: " + shop2.getLocalNumberOfGiveaways());
        System.out.println("Shop 3: " + shop3.getLocalNumberOfGiveaways());
        System.out.println("National level: " + Shop.getMaxNumberOfGiveaways());
    }
}