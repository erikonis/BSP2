public package exercise5;

import java.util.Random;

public class Giveaways {
    public static void main(String[] args) {
        int totalGiveaways = 30;
        ShopWithValidation.setMaxNumberOfGiveaways(totalGiveaways);

        ShopWithValidation shop1 = new ShopWithValidation(totalGiveaways / 3);
        ShopWithValidation shop2 = new ShopWithValidation(totalGiveaways / 3);
        ShopWithValidation shop3 = new ShopWithValidation(totalGiveaways / 3);

        Random random = new Random();

        while (ShopWithValidation.getMaxNumberOfGiveaways() > 0) {
            int shopNumber = random.nextInt(3) + 1;
            double price = random.nextDouble() * 120;
            ItemWithValidation item = new ItemWithValidation(price);

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
        System.out.println("Giveaways left at national level: " + ShopWithValidation.getMaxNumberOfGiveaways());
    }
} {
    
}
