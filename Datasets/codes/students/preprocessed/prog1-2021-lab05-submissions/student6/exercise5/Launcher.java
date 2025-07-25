import java.util.Random;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many giveaways do you want?");
        int maxShop = scanner.nextInt(), giveshop;
        scanner.close();
        maxShop = Math.max(3, maxShop - maxShop % 3);
        giveshop = maxShop / 3;

        Shop shop1 = new Shop(giveshop, maxShop);
        Shop shop2 = new Shop(giveshop, maxShop);
        Shop shop3 = new Shop(giveshop, maxShop);

        while (maxShop != 0) {
            Random random = new Random();
            Item item = new Item(random.nextInt(121));
            shop1.buy(item);
            Item item2 = new Item(random.nextInt(121));
            shop2.buy(item2);
            Item item3 = new Item(random.nextInt(121));
            shop3.buy(item3);
            maxShop = shop1.localNumberOfGiveaways + shop2.localNumberOfGiveaways + shop3.localNumberOfGiveaways;
            System.out.println("National number of giveaways left: " + maxShop);
            System.out.println();
        }
    }
}
