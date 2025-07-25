package Exercise5;

import java.util.Random;

public class Shop {
    private int localNumberOfGiveaways;
    public static int maxNumberOfGiveaways;

    public int getLocalNumberOfGiveaways() {
        return localNumberOfGiveaways;
    }

    Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public void buy(Item item) {
        System.out.println("The price of the item is " + item.getPrice());
        if (localNumberOfGiveaways == 0 || maxNumberOfGiveaways == 0)
            System.out.println("No more giveaways at this shop! Sorry!");
        else {
            Random rand = new Random();
            int chance = rand.nextInt(100);
            boolean w = false;

            if (item.getPrice() < 20) {
                if (chance < 2) {
                    System.out.println("You won the giveaway! Congrats!");
                    w = true;
                } else
                    System.out.println("Better luck next time! ;-;");
            }

            else if (item.getPrice() <= 100) {
                if (chance < 5) {
                    System.out.println("You won the giveaway! Congrats!");
                    w = true;
                } else
                    System.out.println("Better luck next time! ;-;");
            } else {
                if (chance < 10) {
                    System.out.println("You won the giveaway! Congrats!");
                    w = true;
                } else
                    System.out.println("Better luck next time! ;-;");
            }
            if (w) {
                localNumberOfGiveaways--;
                maxNumberOfGiveaways--;
            }

        }

    }

}
