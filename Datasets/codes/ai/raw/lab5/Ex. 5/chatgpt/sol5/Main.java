import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int totalGiveaways = 30;
        int shopCount = 3;
        int giveawaysPerShop = totalGiveaways / shopCount;

        Shop.setTotalGiveaways(totalGiveaways);
        Shop[] shops = {
            new Shop(giveawaysPerShop),
            new Shop(giveawaysPerShop),
            new Shop(giveawaysPerShop)
        };

        Random random = new Random();
        while (Shop.getTotalGiveaways() > 0) {
            int shopIndex = random.nextInt(shops.length);
            double price = random.nextDouble() * 120;
            Item item = new Item(price);
            shops[shopIndex].buy(item);

            try {
                Thread.sleep(100); // just to slow down the output a bit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n🎯 Final Giveaway Report:");
        for (int i = 0; i < shops.length; i++) {
            System.out.printf("Shop %d giveaways left: %d%n", i + 1, shops[i].getLocalNumberOfGiveaways());
        }
        System.out.printf("Total giveaways left nationally: %d%n", Shop.getTotalGiveaways());
    }
}
