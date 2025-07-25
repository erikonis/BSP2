package lu.uni.programming1.lab5.ex5;

import java.util.Random;

public class Shop {
    public int localNumberOfGiveaways;
    static int maxNumberOfGiveaways;

    public Shop(int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public void buy(Item item) {
        System.out.println("Price of the item is: " + item.getPrice());

        if (Shop.maxNumberOfGiveaways > 0 && this.localNumberOfGiveaways > 0) {
            int chance = 0;
            if (item.getPrice() < 20) {
                chance = 2;
            } else if (item.getPrice() < 100) {
                chance = 5;
            } else {
                chance = 10;
            }

            Random r = new Random();
            int dice = r.nextInt(100);

            if (dice < chance) {
                System.out.println("Congratulations you won the giveaway");
                Shop.maxNumberOfGiveaways--;
                this.localNumberOfGiveaways--;
            } else {
                System.out.println("Sorry, no giveaways for you this time...");
            }

        } else if (this.localNumberOfGiveaways == 0) {
            System.out.println("Unfortunately this shop ran out of giveaways");
        } else {
            System.out.println("No giveaways left at nationala level.");
        }

    }

    public int getLocalNumberOfGiveaways() {
        return this.localNumberOfGiveaways;
    }
}