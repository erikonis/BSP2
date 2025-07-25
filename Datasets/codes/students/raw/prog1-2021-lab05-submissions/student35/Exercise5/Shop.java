package src.lu.uni.programming1.lab5.Exercise5;

import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    static public int maxNumberOfGiveaways;

    Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public void buy(Item item) {
        System.out.println("The Price of the purchased item: " + item.getPrice());
        Random random = new Random();
        if (localNumberOfGiveaways == 0) {
            System.out.println("Sorry we are out of giveaways!!!");
        } else {
            if (item.getPrice() < 20) {
                if (random.nextInt(50) == 3) {
                    System.out.println("You have won with your 2% of winning chance!");
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                }
            } else if (item.getPrice() >= 20 && item.getPrice() <= 100) {
                if (random.nextInt(20) == 3) {
                    System.out.println("You have won with your 5% of winning chance!");
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                }
            } else {// We know that the price of the item is bigger than 100€
                if (random.nextInt(10) == 3) {
                    System.out.println("You have won with your 10% of winning chance!");
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                }
            }
            System.out.println("Local number of giveaways item left: " + localNumberOfGiveaways);
        }
    }

}
