import java.util.Scanner;
import java.util.Random;

public class Giveaway {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the total number of giveaways (at least 3 !): ");
        int maxNumberOfGiveaways = Math.max(3, scanner.nextInt()), l1,rest1,rest2,price;
        scanner.close();
        // assign the giveaways equally
        l1 = maxNumberOfGiveaways / 3;
        rest1 = maxNumberOfGiveaways % 3;
        rest2 = rest1/2;
        if (rest1 == 2) {
            rest1 = 1;
        }
        Shop shop1 = new Shop(l1, maxNumberOfGiveaways);
        Shop shop2 = new Shop(l1 + rest1, maxNumberOfGiveaways);
        Shop shop3 = new Shop(l1 + rest2, maxNumberOfGiveaways);

        while (maxNumberOfGiveaways != 0) {
            price = random.nextInt(120);
            Item item = new Item(price);
            shop1.buy(item);
            shop2.buy(item);
            shop3.buy(item);
            maxNumberOfGiveaways = shop1.localNumberOfGiveaways + shop2.localNumberOfGiveaways + shop3.localNumberOfGiveaways;
            System.out.printf("\nremaining for shop1: %d \nremaining for shop2: %d \nremaining for shop3: %d \nremaining nationally: %d ", shop1.localNumberOfGiveaways, shop2.localNumberOfGiveaways,shop3.localNumberOfGiveaways,maxNumberOfGiveaways);
        }   
    }
}
