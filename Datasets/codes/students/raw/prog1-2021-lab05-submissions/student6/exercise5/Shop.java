package lu.uni.programming1.lab5.exercise5;

import java.util.Random;

public class Shop {
    public int localNumberOfGiveaways;
    private int maxNumberOfGiveaways;

    Shop(int localNumberOfGiveaways, int maxNumberOfGiveaways) {
        this.maxNumberOfGiveaways = maxNumberOfGiveaways;
        this.localNumberOfGiveaways = localNumberOfGiveaways;

    }

    public void buy(Item item) {
        System.out.println("Price of the purchased item: " + item.getX());
        Random random = new Random();
        if (localNumberOfGiveaways == 0 || maxNumberOfGiveaways == 0) {
            System.out.println("Sorry we are out of giveaways: ");
        } else {

            if (item.getX() < 20) {
                if (random.nextInt(50) == 5) {
                    System.out.println("You won");
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                }
            } else if (item.getX() <= 20 && item.getX() >= 100) {
                if (random.nextInt(20) == 5) {
                    System.out.println("You won");
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                }
            } else if (item.getX() > 100) {
                if (random.nextInt(10) == 5) {
                    System.out.println("You won");
                    --localNumberOfGiveaways;
                    --maxNumberOfGiveaways;
                }
            }
        }

        System.out.println("Local number of giveaways item left: " + localNumberOfGiveaways);
    }

}
