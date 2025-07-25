package lu.uni.programming1.lab5.ex5;

import java.util.Random;
import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int giveAways;
        do {
            System.out.println("Enter the total number of giveaways: ");
            giveAways = scanner.nextInt();
        } while (giveAways <= 0 || giveAways % 3 != 0);
        int giveawaysPerShop = giveAways / 3;

        Shop shop1 = new Shop(giveawaysPerShop);
        Shop shop2 = new Shop(giveawaysPerShop);
        Shop shop3 = new Shop(giveawaysPerShop);

        Random r = new Random();
        Shop.maxNumberOfGiveaways = giveAways;
        while (Shop.maxNumberOfGiveaways > 0) {
            shop1.buy(new Item(r.nextDouble() * 120));
            shop2.buy(new Item(r.nextDouble() * 120));
            shop3.buy(new Item(r.nextDouble() * 120));
        }
        System.out.println(Shop.maxNumberOfGiveaways + " giveaways left");
        System.out.println("Shop 1 has " + shop1.getLocalNumberOfGiveaways() + " giveaways left");
        System.out.println("Shop 2 has " + shop2.getLocalNumberOfGiveaways() + " giveaways left");
        System.out.println("Shop 3 has " + shop3.getLocalNumberOfGiveaways() + " giveaways left");

        scanner.close();
    }
}