import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int maxNumberOfGiveaways = 2;
    int min = 0;
    int max = 120;
    int NumberOfGiveaways = 0;
    int NumberOfGiveaways1 = 0;
    int NumberOfGiveaways2 = 0;
    int NumberOfGiveaways3 = 0;
    
    while(maxNumberOfGiveaways%3!=0){
        System.out.print("Please enter the maximum number of giveaways (divisible by 3): ");
        maxNumberOfGiveaways = scanner.nextInt();
    }

    int localNumberOfGiveaways = maxNumberOfGiveaways/3;
    Shop shop1 = new Shop(localNumberOfGiveaways,maxNumberOfGiveaways);
    Shop shop2 = new Shop(localNumberOfGiveaways,maxNumberOfGiveaways);
    Shop shop3 = new Shop(localNumberOfGiveaways,maxNumberOfGiveaways);

    while(maxNumberOfGiveaways!=0){
        int randomShop = (int)Math.floor(Math.random()*(3-1+1)+1);
        int randomPrice = (int)Math.floor(Math.random()*(max-min+1)+min);
        Item item = new Item(randomPrice);
        
        switch(randomShop){
            case 1: shop1.buy(item);
                ++NumberOfGiveaways1;
            break;

            case 2: shop2.buy(item);
                ++NumberOfGiveaways2;
            break;

            case 3: shop3.buy(item);
                ++NumberOfGiveaways3;
            break;
        }
        --maxNumberOfGiveaways;
        ++NumberOfGiveaways;
    }

    System.out.println("The number of giveaways left by shop1 is: " + NumberOfGiveaways1);
    System.out.println("The number of giveaways left by shop2 is: " + NumberOfGiveaways2);
    System.out.println("The number of giveaways left by shop3 is: " + NumberOfGiveaways3);
    System.out.println("The number of giveaways left at national level is: " + NumberOfGiveaways);

    scanner.close();
}
    
}
