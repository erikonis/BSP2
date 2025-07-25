public package exercise5;

import java.util.Random;

public class Giveaways {
    public static void main(String[] args) {
        int totalGiveaways = 30;
        ShopWithCategory.setMaxNumberOfGiveaways(totalGiveaways);

        ShopWithCategory shop1 = new ShopWithCategory(totalGiveaways / 3);
        ShopWithCategory shop2 = new ShopWithCategory(totalGiveaways / 3);
        ShopWithCategory shop3 = new ShopWithCategory(totalGiveaways / 3);

        Random random = new Random();

        while (ShopWithCategory.getMaxNumberOfGiveaways() > 0) {
            int shopNumber = random.nextInt(3) + 1;
            double price = random.nextDouble() * 120;
            String category = random.nextBoolean() ? "Electronics" : "Clothing";
            ItemWithCategory item = new ItemWithCategory(price, category);

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
        System.out.println("Giveaways left at national level: " + ShopWithCategory.getMaxNumberOfGiveaways());
    }
} {
    
}
