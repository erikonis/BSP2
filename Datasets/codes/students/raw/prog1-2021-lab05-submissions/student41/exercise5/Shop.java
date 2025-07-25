package lu.uni.programming1.lab5.exercise5;

import java.util.Random;

public class Shop {

    private int localNumberOfGiveaways;

    private static int maxNumberOfGiveaways = 0;

    public Shop (int localNumberOfGiveaways) {
        this.localNumberOfGiveaways = localNumberOfGiveaways;
        maxNumberOfGiveaways += localNumberOfGiveaways;
    }

    public int getLocal() {
        return localNumberOfGiveaways;
    }

    public int getMax() {
        return maxNumberOfGiveaways;
    }


    public int buy(Item item) {

        int price = item.getPrice();
        System.out.println("Price of item: " + price);

        if (localNumberOfGiveaways == 0) 
           {System.out.println("No more giveaways in this shop !");
           return 0;}
        if (maxNumberOfGiveaways == 0)
           {System.out.println("Nor more giveaways left !");
           return 2;}

        else {

            Random rand = new Random();
            int upper = 100;
            int chance = rand.nextInt(upper);

            if (price < 20 && chance <= 1) {
                System.out.println("Yon won a giveaway !");
                localNumberOfGiveaways--;
                maxNumberOfGiveaways--;
                }
            if (price >= 20 && price <= 100 && chance <= 4 ) {
                System.out.println("Yon won a giveaway !");
                localNumberOfGiveaways--;
                maxNumberOfGiveaways--;
                }
            if (price >= 100 && chance <= 9) {
                System.out.println("Yon won a giveaway !");
                localNumberOfGiveaways--;
                maxNumberOfGiveaways--;
                }
            else {System.out.println("No giveaway.");
                 }
                 return 0;

        }
        

    }

    }

    
    

