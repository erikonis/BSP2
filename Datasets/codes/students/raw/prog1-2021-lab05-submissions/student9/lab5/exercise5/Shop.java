package lab5.exercise5;

import java.util.Scanner;

public class Shop {
    int localNumberOfGiveaways;
    private static int maxNumberOfGiveaways;

    public Shop (int localNumberOfGiveaways){
        this.localNumberOfGiveaways = localNumberOfGiveaways;
    }

    public double randomD (double min, double max){
        return Math.random()*(max-min)+min;
    }

    public void buy(Item item) {

        System.out.println("Price : "+item.getPrice());

        if(maxNumberOfGiveaways==0)
            System.out.println("There are no more giveaways left at national level");
        else if(localNumberOfGiveaways==0)
            System.out.println("The shop itself has no more giveaways left");
        else{
            double price = item.getPrice();
            boolean hasWon = false;
            double randomNmb = Math.random();
            if(price < 20){
                if(randomNmb<=0.02)
                        hasWon = true;
            }
            else if(price < 100){
                if(randomNmb<=0.05)
                        hasWon = true;
            }
            else if(price > 100){
                if(randomNmb<=0.1)
                        hasWon = true;
            }
            else{
                System.out.println("Error : wrong price value");
            }

            if(hasWon){
                localNumberOfGiveaways--;
                maxNumberOfGiveaways--;
                System.out.println("Congratulation! YOU WON THE GIVEAWAY !!!!");
            }
            else
                System.out.println("Sorry, maybe you´ll win next time");

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Max number of Giveaways : ");

        maxNumberOfGiveaways=scanner.nextInt();

        scanner.close();

        int third = maxNumberOfGiveaways/3;
        int rest = maxNumberOfGiveaways%3;

        Shop shop1 = new Shop(third);
        Shop shop2 = new Shop(third);
        Shop shop3 = new Shop(third+rest);

        while(maxNumberOfGiveaways != 0){
            Item item1 = new Item(Math.random()*120);
            shop1.buy(item1);
            Item item2 = new Item(Math.random()*120);
            shop2.buy(item2);
            Item item3 = new Item(Math.random()*120);
            shop3.buy(item3);

            System.out.println("\nGiveaway left :");
            System.out.println("Shop 1. "+shop1.localNumberOfGiveaways);
            System.out.println("Shop 2. "+shop2.localNumberOfGiveaways);
            System.out.println("Shop 3. "+shop3.localNumberOfGiveaways);
            System.out.println("National : "+maxNumberOfGiveaways+"\n");
        }
        
    }
}
