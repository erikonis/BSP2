package giveaways;

import java.util.Random;
import java.util.Scanner;

public class GiveawaysTest {
    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of giveaways: ");
        int totalGiveaways = scanner.nextInt();
        Shop.setMaxNumberOfGiveaways(totalGiveaways);

        int giveawaysPerShop = totalGiveaways / 3;
        Shop shop1 = new Shop(giveawaysPerShop);
        Shop shop2 = new Shop(giveawaysPerShop);
        Shop shop3 = new Shop(giveawaysPerShop);

        Random random = new Random();

        while (Shop.getNationalNumberOfGiveaways() > 0) {
            double price = random.nextDouble() * 120;
            Item item = new Item(price);
            int shopNumber = random.nextInt(3);

            switch (shopNumber) {
                case 0:
                    shop1.buy(item);
                    break;
                case 1:
                    shop2.buy(item);
                    break;
                case 2:
                    shop3.buy(item);
                    break;
            }
        }

        System.out.println("\nGiveaways left:");
        System.out.println("Shop 1: " + shop1.getLocalNumberOfGiveaways());
        System.out.println("Shop 2: " + shop2.getLocalNumberOfGiveaways());
        System.out.println("Shop 3: " + shop3.getLocalNumberOfGiveaways());
        System.out.println("National: " + Shop.getNationalNumberOfGiveaways());

        scanner.close();
    }
}