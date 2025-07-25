package lu.uni.programming1.lab5.exercise5;

import java.util.Scanner;

import java.util.Random;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //gets total number of giveaways
        System.out.print("How many giveaways should there be in total? ");
        int giveaways = scanner.nextInt();

        //sets giveaways per shop while creating the shop
        Shop shop1 = new Shop((giveaways - (giveaways) % 3) / 3);
        Shop shop2 = new Shop((giveaways - (giveaways) % 3) / 3);
        Shop shop3 = new Shop((giveaways - (giveaways) % 3) / 3);

        //simulating customers buying
        System.out.print("How many customers are there? ");
        int customers = scanner.nextInt();

        for (int i = 0; i < customers && giveaways > 0; i++) {
            int randomShop = random.nextInt(3);
            double randomPrice = (random.nextInt(12000) + 1) / 100;
            Item item = new Item(randomPrice);

            if (randomShop == 0) {
                shop1.buy(item);
            } else if (randomShop == 1) {
                shop2.buy(item);
            } else {
                shop3.buy(item);
            }
            
            giveaways = shop1.getLocal() + shop2.getLocal() + shop3.getLocal();
        }

        System.out.println("The giveaways that are left are:\nIn shop 1: " + shop1.getLocal() + "\nIn shop 2: " + shop2.getLocal() + "\nIn shop 3: " + shop3.getLocal() + "\nIn Luxembourg: " + giveaways);

        scanner.close();
    }
}
