import java.util.Random;
import java.util.Scanner;

public class Teriaki {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total number of giveaways: ");

        int total = scanner.nextInt();
        int third = total / 3;
        int remain = total - 3 * third;

        // The number of giveaways is equally distributed if remain = 0.
        
        Shop s1 = new Shop(third + remain);
        Shop s2 = new Shop(third);
        Shop s3 = new Shop(third);

        int rule = 1;

        
            

        while (rule != 0) {

            Random rand = new Random();
            int upper = 121;
            int price1 = rand.nextInt(upper);
            int price2 = rand.nextInt(upper);
            int price3 = rand.nextInt(upper);

            Item i = new Item(price1);
            Item i2 = new Item(price2);
            Item i3 = new Item(price3);

            s1.buy(i);
            s2.buy(i2);
            s3.buy(i3);

            rule = s3.getMax();

            System.out.println("Giveaways left: ");
            System.out.println("Shop 1: " + s1.getLocal());
            System.out.println("Shop 2: " + s2.getLocal());
            System.out.println("Shop 3: " + s3.getLocal());
            System.out.println("Total left: " + s3.getMax());
            
        }


        scanner.close();


    }
    
}
