package exercise5;

import java.util.Random;

public class GiveawaysMain {
    public static void main(String[] args) {
        int totalGiveaways = 30;
        Shop.setMaxNumberOfGiveaways(totalGiveaways);

        Shop shop1 = new Shop(totalGiveaways / 3);
        Shop shop2 = new Shop(totalGiveaways / 3);
        Shop shop3 = new Shop(totalGiveaways / 3);

        Random random = new Random();

        while (Shop.getMaxNumberOfGiveaways() > 0) {
            int shopNumber = random.nextInt(3) + 1;
            double price = random.nextDouble() * 120;
            Item item = new Item(price);

            switch (shopNumber) {
                case 1:
                    shop1.buy(item);
                    break;
                case 2:
                    shop2.buy(item);
                    break;
                case 3:
                    shop3.buy(item);
                    break;
            }
        }

        System.out.println("Giveaways left in Shop 1: " + shop1.getLocalNumberOfGiveaways());
        System.out.println("Giveaways left in Shop 2: " + shop2.getLocalNumberOfGiveaways());
        System.out.println("Giveaways left in Shop 3: " + shop3.getLocalNumberOfGiveaways());
        System.out.println("Giveaways left at national level: " + Shop.getMaxNumberOfGiveaways());
    }
}