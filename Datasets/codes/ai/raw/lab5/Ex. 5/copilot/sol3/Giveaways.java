package exercise5;

import java.util.Random;

public class Giveaways {
    public static void main(String[] args) {
        int totalGiveaways = 30;
        ShopWithDiscount.setMaxNumberOfGiveaways(totalGiveaways);

        ShopWithDiscount shop1 = new ShopWithDiscount(totalGiveaways / 3);
        ShopWithDiscount shop2 = new ShopWithDiscount(totalGiveaways / 3);
        ShopWithDiscount shop3 = new ShopWithDiscount(totalGiveaways / 3);

        Random random = new Random();

        while (ShopWithDiscount.getMaxNumberOfGiveaways() > 0) {
            int shopNumber = random.nextInt(3) + 1;
            double price = random.nextDouble() * 120;
            double discount = random.nextDouble() * 50; // Random discount between 0% and 50%
            ItemWithDiscount item = new ItemWithDiscount(price, discount);

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
        System.out.println("Giveaways left at national level: " + ShopWithDiscount.getMaxNumberOfGiveaways());
    }
}