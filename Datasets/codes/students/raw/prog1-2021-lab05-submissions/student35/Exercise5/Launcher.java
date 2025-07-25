package src.lu.uni.programming1.lab5.Exercise5;

import java.util.Random;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxShop, giveShop;
        do {
            System.out.println("How many giveaways do you want? (Notice that must be divisible by 3!)");
            maxShop = scanner.nextInt();
        } while (maxShop % 3 != 0);
        scanner.close();
        giveShop = maxShop / 3;
        Shop.maxNumberOfGiveaways = maxShop;

        Shop shop1 = new Shop(giveShop);
        Shop shop2 = new Shop(giveShop);
        Shop shop3 = new Shop(giveShop);

        while (maxShop != 0) {
            Random random = new Random();
            Item item = new Item(random.nextInt(121));
            shop1.buy(item);
            Item item2 = new Item(random.nextInt(121));
            shop2.buy(item2);
            Item item3 = new Item(random.nextInt(121));
            shop3.buy(item3);
            maxShop = Shop.maxNumberOfGiveaways;
            System.out.println("Number of National giveaways left: " + maxShop);
            System.out.println("Next three clients will come");
        }
    }
}
