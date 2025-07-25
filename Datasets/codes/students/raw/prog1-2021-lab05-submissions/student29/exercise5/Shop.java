package lu.uni.programming1.lab5.exercise5;

import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;

    private int maxNumberOfGiveaways;

    Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        this.maxNumberOfGiveaways = 3 * localNumberOfGiveaways;
    }

    public void buy(Item item) {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;

        //prints the price of the item
        System.out.println("The item costs " + item.getPrice() + "€.");

        if (localNumberOfGiveaways == 0) {
            //prints if there are no giveaways left
            if (maxNumberOfGiveaways == 0) {
                System.out.println("There are no giveaways left in Luxembourg!");
            } else {
                System.out.println("There are no giveaways left in this shop!\nBut you still can try your luck in one of our other shops in Luxembourg!");
            }
        //randomly chooses winner depening on price
        } else if (item.getPrice() <= 20) {
            if (chance <= 2) {
                System.out.println("You won a giveaway!");
                localNumberOfGiveaways -= 1;
                maxNumberOfGiveaways -= 1;
            }
        } else if (item.getPrice() <= 100) {
            if (chance <= 5) {
                System.out.println("You won a giveaway!");
                localNumberOfGiveaways -= 1;
                maxNumberOfGiveaways -= 1;
            }
        } else if (item.getPrice() > 100) {
            if (chance <= 10) {
                System.out.println("You won a giveaway!");
                localNumberOfGiveaways -= 1;
                maxNumberOfGiveaways -= 1;
            }
        }
    }

    public int getLocal() {
        return localNumberOfGiveaways;
    }
}
